package com.example.expensestracker.features.transaction.topexpense.ui

import androidx.lifecycle.viewModelScope
import com.example.expensestracker.features.transaction.summary.ui.toTopExpenseItems
import com.example.expensestracker.features.transaction.topexpense.data.ITopExpenseEnvironment
import com.example.expensestracker.foundation.coreviewmodel.StatefulViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch

@HiltViewModel
class TopExpenseViewModel @Inject constructor(
    topExpenseEnvironment: ITopExpenseEnvironment
) : StatefulViewModel<TopExpenseState, TopExpenseEffect, TopExpenseAction, ITopExpenseEnvironment>(TopExpenseState(), topExpenseEnvironment) {

    init {
        initLoad()
    }

    private fun initLoad() {
        viewModelScope.launch {
            combine(
                environment.getTopExpense(),
                environment.getCurrency()
            ) { topExpenses, currency ->
                setState {
                    copy(
                        topExpenseItems = topExpenses.toTopExpenseItems(),
                        currency = currency
                    )
                }
            }.collect()
        }
    }

    override fun dispatch(action: TopExpenseAction) {

    }

}
