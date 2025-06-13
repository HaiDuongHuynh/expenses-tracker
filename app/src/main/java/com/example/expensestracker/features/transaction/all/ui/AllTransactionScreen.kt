package com.example.expensestracker.features.transaction.all.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.expensestracker.features.transaction.summary.ui.TransactionItem
import com.example.expensestracker.features.transaction.summary.ui.getAccountDisplay
import com.example.expensestracker.features.transaction.summary.ui.getAmountColor
import com.example.expensestracker.features.transaction.summary.ui.getAmountDisplay
import com.example.expensestracker.features.transaction.summary.ui.getDateTimeDisplay
import com.example.expensestracker.features.transaction.summary.ui.getTitle
import com.example.expensestracker.foundation.extension.getSymbol
import com.example.expensestracker.foundation.theme.AlphaDisabled
import com.example.expensestracker.foundation.theme.DividerAlpha
import com.example.expensestracker.foundation.uicomponent.PgAmountLabel
import com.example.expensestracker.foundation.uicomponent.PgContentTitle
import com.example.expensestracker.foundation.uicomponent.PgDateLabel
import com.example.expensestracker.foundation.uicomponent.PgEmpty
import com.example.expensestracker.foundation.uicomponent.PgHeadline1
import com.example.expensestracker.foundation.uicomponent.PgPageLayout
import com.example.expensestracker.R


@Composable
fun AllTransactionScreen(
    viewModel: AllTransactionViewModel,
    onTransactionItemClick: (String) -> Unit,
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val effect by viewModel.effect.collectAsStateWithLifecycle()

    AllTransactionScreen(
        state = state,
        onTransactionItemClick = {
            onTransactionItemClick(it.transactionId)
        },
    )
}

@Composable
private fun AllTransactionScreen(
    state: AllTransactionState,
    onTransactionItemClick: (TransactionItem) -> Unit,
) {
    PgPageLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        Content(
            state = state,
            onTransactionItemClick = onTransactionItemClick,
        )
    }
}

@Composable
private fun Content(
    state: AllTransactionState,
    onTransactionItemClick: (TransactionItem) -> Unit,
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            PgHeadline1(
                text = stringResource(R.string.all_transaction_headline),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )
        }

        item {
            SpacerSection()
        }

        TransactionCell(
            data = state.transactionItems,
            onItemClick = onTransactionItemClick,
        )

        item {
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}

private fun LazyListScope.TransactionCell(
    data: List<TransactionItem>,
    onItemClick: (TransactionItem) -> Unit,
) {
    if (data.isEmpty()) {
        item {
            PgEmpty(
                stringResource(R.string.all_transaction_empty),
                modifier = Modifier.height(500.dp)
            )
        }
    } else {
        itemsIndexed(
            items = data,
            key = { _, item -> item.transactionId }
        ) { _, item ->
            TransactionItemCell(
                title = item.getTitle(),
                account = item.getAccountDisplay(),
                dateTime = item.getDateTimeDisplay(),
                amount = item.getAmountDisplay(),
                amountSymbol = item.currency.getSymbol(),
                amountColor = item.getAmountColor(
                    MaterialTheme.colorScheme.onBackground
                ),
                note = item.note,
                onClick = { onItemClick(item) }
            )
        }
    }
}

@Composable
private fun TransactionItemCell(
    title: String,
    account: String,
    dateTime: String,
    amount: String,
    amountSymbol: String,
    amountColor: Color,
    note: String,
    onClick: () -> Unit,
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 8.dp, bottom = 2.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom,
            ) {
                PgContentTitle(
                    text = title,
                    modifier = Modifier.padding(end = 4.dp)
                )

                PgDateLabel(
                    text = dateTime,
                )
            }

            PgAmountLabel(
                amount = amount,
                symbol = amountSymbol,
                color = amountColor,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, bottom = 2.dp, end = 16.dp),
            )

            PgContentTitle(
                text = account,
                color = MaterialTheme.colorScheme.onBackground.copy(AlphaDisabled),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, bottom = 2.dp, end = 16.dp),
            )

            PgContentTitle(
                text = note,
                color = MaterialTheme.colorScheme.onBackground.copy(AlphaDisabled),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
            )

            HorizontalDivider(
                modifier = Modifier.padding(start = 16.dp),
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = DividerAlpha)
            )
        }
    }
}

@Composable
private fun SpacerSection() {
    Spacer(modifier = Modifier.height(16.dp))
}
