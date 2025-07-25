package com.example.expensestracker.foundation.currency

/**
 * Currency code follow ISO 4217
 * https://en.wikipedia.org/wiki/ISO_4217
 */
class CurrencyData(
    val num: Int,
    val scale: Int,
    val name: String,
    val symbol: String,
    val countryCodes: List<String>
)

/**
 * Country code follow ISO 3166
 * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
 *
 * Lang code follow ISO 639 alpha-2
 * https://www.loc.gov/standards/iso639-2/php/code_list.php
 */
data class Country(
    val lang: String,
    val name: String
)

val COUNTRY_DATA = mapOf(
    "AE" to Country(lang = "ar", name = "United Arab Emirates"),
    "AF" to Country(lang = "uz", name = "Afghanistan"),
    "AL" to Country(lang = "sq", name = "Albania"),
    "AM" to Country(lang = "hy", name = "Armenia"),
    "CW" to Country(lang = "nl", name = "Curaçao"),
    "SX" to Country(lang = "nl", name = "Sint Maarten"),
    "AO" to Country(lang = "pt", name = "Angola"),
    "AR" to Country(lang = "es", name = "Argentina"),
    "AU" to Country(lang = "en", name = "Australia"),
    "CX" to Country(lang = "en", name = "Christmas Island"),
    "CC" to Country(lang = "en", name = "Cocos Keeling Islands"),
    "HM" to Country(lang = "", name = "Heard Island and McDonald Islands"),
    "KI" to Country(lang = "en", name = "Kiribati"),
    "NR" to Country(lang = "en", name = "Nauru"),
    "NF" to Country(lang = "en", name = "Norfolk Island"),
    "TV" to Country(lang = "en", name = "Tuvalu"),
    "AW" to Country(lang = "nl", name = "Aruba"),
    "AZ" to Country(lang = "az", name = "Azerbaijan"),
    "BA" to Country(lang = "hr", name = "Bosnia and Herzegovina"),
    "BB" to Country(lang = "en", name = "Barbados"),
    "BD" to Country(lang = "ccp", name = "Bangladesh"),
    "BG" to Country(lang = "bg", name = "Bulgaria"),
    "BH" to Country(lang = "ar", name = "Bahrain"),
    "BI" to Country(lang = "rn", name = "Burundi"),
    "BM" to Country(lang = "en", name = "Bermuda"),
    "BN" to Country(lang = "ms", name = "Brunei"),
    "BO" to Country(lang = "qu", name = "Bolivia"),
    "BR" to Country(lang = "es", name = "Brazil"),
    "BS" to Country(lang = "en", name = "Bahamas"),
    "BT" to Country(lang = "dz", name = "Bhutan"),
    "BW" to Country(lang = "en", name = "Botswana"),
    "BY" to Country(lang = "ru", name = "Belarus"),
    "BZ" to Country(lang = "es", name = "Belize"),
    "CA" to Country(lang = "en", name = "Canada"),
    "CD" to Country(lang = "lu", name = "Democratic Republic of the Congo"),
    "CH" to Country(lang = "en", name = "Switzerland"),
    "LI" to Country(lang = "de", name = "Liechtenstein"),
    "CL" to Country(lang = "es", name = "Chile"),
    "CO" to Country(lang = "es", name = "Colombia"),
    "CR" to Country(lang = "es", name = "Costa Rica"),
    "CU" to Country(lang = "es", name = "Cuba"),
    "CV" to Country(lang = "pt", name = "Cabo Verde"),
    "CZ" to Country(lang = "cs", name = "Czechia"),
    "DJ" to Country(lang = "ar", name = "Djibouti"),
    "DK" to Country(lang = "fo", name = "Denmark"),
    "FO" to Country(lang = "fo", name = "Faroe Islands"),
    "GL" to Country(lang = "da", name = "Greenland"),
    "DO" to Country(lang = "es", name = "Dominican Republic"),
    "DZ" to Country(lang = "ar", name = "Algeria"),
    "EG" to Country(lang = "ar", name = "Egypt"),
    "ER" to Country(lang = "ar", name = "Eritrea"),
    "ET" to Country(lang = "so", name = "Ethiopia"),
    "AX" to Country(lang = "sv", name = "Åland Islands"),
    "AD" to Country(lang = "ca", name = "Andorra"),
    "AT" to Country(lang = "de", name = "Austria"),
    "BE" to Country(lang = "nl", name = "Belgium"),
    "CY" to Country(lang = "tr", name = "Cyprus"),
    "EE" to Country(lang = "et", name = "Estonia"),
    "FI" to Country(lang = "smn", name = "Finland"),
    "FR" to Country(lang = "br", name = "France"),
    "TF" to Country(lang = "", name = "French Southern and Antarctic Lands"),
    "DE" to Country(lang = "en", name = "Germany"),
    "GR" to Country(lang = "el", name = "Greece"),
    "GP" to Country(lang = "fr", name = "Guadeloupe"),
    "IE" to Country(lang = "ga", name = "Ireland"),
    "IT" to Country(lang = "fur", name = "Italy"),
    "LV" to Country(lang = "lv", name = "Latvia"),
    "LT" to Country(lang = "lt", name = "Lithuania"),
    "LU" to Country(lang = "de", name = "Luxembourg"),
    "MT" to Country(lang = "mt", name = "Malta"),
    "GF" to Country(lang = "fr", name = "French Guiana"),
    "MQ" to Country(lang = "fr", name = "Martinique"),
    "YT" to Country(lang = "fr", name = "Mayotte"),
    "MC" to Country(lang = "fr", name = "Monaco"),
    "ME" to Country(lang = "sr", name = "Montenegro"),
    "NL" to Country(lang = "nds", name = "Netherlands"),
    "PT" to Country(lang = "pt", name = "Portugal"),
    "RE" to Country(lang = "fr", name = "Réunion"),
    "BL" to Country(lang = "fr", name = "Saint Barthélemy"),
    "MF" to Country(lang = "fr", name = "Saint Martin"),
    "PM" to Country(lang = "fr", name = "Saint Pierre and Miquelon"),
    "SM" to Country(lang = "it", name = "San Marino"),
    "SK" to Country(lang = "sk", name = "Slovakia"),
    "SI" to Country(lang = "en", name = "Slovenia"),
    "ES" to Country(lang = "gl", name = "Spain"),
    "VA" to Country(lang = "it", name = "Vatican City"),
    "FJ" to Country(lang = "en", name = "Fiji"),
    "FK" to Country(lang = "en", name = "Falkland Islands"),
    "GB" to Country(lang = "cy", name = "United Kingdom"),
    "IM" to Country(lang = "en", name = "Isle of Man"),
    "JE" to Country(lang = "en", name = "Jersey"),
    "GG" to Country(lang = "en", name = "Guernsey"),
    "GE" to Country(lang = "ka", name = "Georgia"),
    "GH" to Country(lang = "ak", name = "Ghana"),
    "GI" to Country(lang = "en", name = "Gibraltar"),
    "GM" to Country(lang = "en", name = "Gambia"),
    "GN" to Country(lang = "ff", name = "Guinea"),
    "GT" to Country(lang = "es", name = "Guatemala"),
    "GY" to Country(lang = "en", name = "Guyana"),
    "HK" to Country(lang = "en", name = "Hong Kong"),
    "HN" to Country(lang = "es", name = "Honduras"),
    "HR" to Country(lang = "hr", name = "Croatia"),
    "HT" to Country(lang = "fr", name = "Haiti"),
    "HU" to Country(lang = "hu", name = "Hungary"),
    "ID" to Country(lang = "in", name = "Indonesia"),
    "IL" to Country(lang = "iw", name = "Israel"),
    "IN" to Country(lang = "ccp", name = "India"),
    "IQ" to Country(lang = "ckb", name = "Iraq"),
    "IR" to Country(lang = "ckb", name = "Iran"),
    "IS" to Country(lang = "is", name = "Iceland"),
    "JM" to Country(lang = "en", name = "Jamaica"),
    "JO" to Country(lang = "ar", name = "Jordan"),
    "JP" to Country(lang = "ja", name = "Japan"),
    "KE" to Country(lang = "mas", name = "Kenya"),
    "KG" to Country(lang = "ky", name = "Kyrgyzstan"),
    "KH" to Country(lang = "km", name = "Cambodia"),
    "KM" to Country(lang = "fr", name = "Comoros"),
    "KP" to Country(lang = "ko", name = "North Korea"),
    "KR" to Country(lang = "ko", name = "South Korea"),
    "KW" to Country(lang = "ar", name = "Kuwait"),
    "KY" to Country(lang = "en", name = "Cayman Islands"),
    "KZ" to Country(lang = "ru", name = "Kazakhstan"),
    "LA" to Country(lang = "lo", name = "Laos"),
    "LB" to Country(lang = "ar", name = "Lebanon"),
    "LK" to Country(lang = "si", name = "Sri Lanka"),
    "LR" to Country(lang = "vai", name = "Liberia"),
    "LS" to Country(lang = "en", name = "Lesotho"),
    "LY" to Country(lang = "ar", name = "Libya"),
    "MA" to Country(lang = "shi", name = "Morocco"),
    "EH" to Country(lang = "ar", name = "Western Sahara"),
    "MD" to Country(lang = "ro", name = "Moldova"),
    "MG" to Country(lang = "mg", name = "Madagascar"),
    "MK" to Country(lang = "mk", name = "North Macedonia"),
    "MM" to Country(lang = "my", name = "Myanmar"),
    "MN" to Country(lang = "mn", name = "Mongolia"),
    "MO" to Country(lang = "zh", name = "Macau"),
    "MR" to Country(lang = "ff", name = "Mauritania"),
    "MU" to Country(lang = "en", name = "Mauritius"),
    "MV" to Country(lang = "", name = "Maldives"),
    "MW" to Country(lang = "en", name = "Malawi"),
    "MX" to Country(lang = "es", name = "Mexico"),
    "MY" to Country(lang = "en", name = "Malaysia"),
    "MZ" to Country(lang = "seh", name = "Mozambique"),
    "NA" to Country(lang = "af", name = "Namibia"),
    "NG" to Country(lang = "ig", name = "Nigeria"),
    "NI" to Country(lang = "es", name = "Nicaragua"),
    "NO" to Country(lang = "nn", name = "Norway"),
    "SJ" to Country(lang = "nb", name = "Svalbard and Jan Mayen"),
    "BV" to Country(lang = "", name = "Bouvet Island"),
    "NP" to Country(lang = "ne", name = "Nepal"),
    "NZ" to Country(lang = "en", name = "New Zealand"),
    "CK" to Country(lang = "en", name = "Cook Islands"),
    "NU" to Country(lang = "en", name = "Niue"),
    "PN" to Country(lang = "en", name = "Pitcairn Islands"),
    "TK" to Country(lang = "en", name = "Tokelau"),
    "OM" to Country(lang = "ar", name = "Oman"),
    "PA" to Country(lang = "es", name = "Panama"),
    "PE" to Country(lang = "qu", name = "Peru"),
    "PG" to Country(lang = "en", name = "Papua New Guinea"),
    "PH" to Country(lang = "en", name = "Philippines"),
    "PK" to Country(lang = "sd", name = "Pakistan"),
    "PL" to Country(lang = "pl", name = "Poland"),
    "PY" to Country(lang = "es", name = "Paraguay"),
    "QA" to Country(lang = "ar", name = "Qatar"),
    "RO" to Country(lang = "ro", name = "Romania"),
    "RS" to Country(lang = "sr", name = "Serbia"),
    "CN" to Country(lang = "ug", name = "China"),
    "RU" to Country(lang = "os", name = "Russia"),
    "RW" to Country(lang = "fr", name = "Rwanda"),
    "SA" to Country(lang = "ar", name = "Saudi Arabia"),
    "SB" to Country(lang = "en", name = "Solomon Islands"),
    "SC" to Country(lang = "en", name = "Seychelles"),
    "SD" to Country(lang = "en", name = "Sudan"),
    "SE" to Country(lang = "en", name = "Sweden"),
    "SG" to Country(lang = "en", name = "Singapore"),
    "SH" to Country(lang = "en", name = "Saint Helena"),
    "SL" to Country(lang = "en", name = "Sierra Leone"),
    "SO" to Country(lang = "so", name = "Somalia"),
    "SR" to Country(lang = "nl", name = "Suriname"),
    "SS" to Country(lang = "ar", name = "South Sudan"),
    "ST" to Country(lang = "pt", name = "São Tomé and Príncipe"),
    "SV" to Country(lang = "es", name = "El Salvador"),
    "SY" to Country(lang = "fr", name = "Syria"),
    "SZ" to Country(lang = "en", name = "Eswatini"),
    "TH" to Country(lang = "th", name = "Thailand"),
    "TJ" to Country(lang = "tg", name = "Tajikistan"),
    "TM" to Country(lang = "tk", name = "Turkmenistan"),
    "TN" to Country(lang = "ar", name = "Tunisia"),
    "TO" to Country(lang = "en", name = "Tonga"),
    "TR" to Country(lang = "tr", name = "Turkey"),
    "TT" to Country(lang = "en", name = "Trinidad and Tobago"),
    "TW" to Country(lang = "zh", name = "Taiwan"),
    "TZ" to Country(lang = "mas", name = "Tanzania"),
    "UA" to Country(lang = "ru", name = "Ukraine"),
    "UG" to Country(lang = "en", name = "Uganda"),
    "US" to Country(lang = "chr", name = "United States"),
    "AS" to Country(lang = "en", name = "American Samoa"),
    "IO" to Country(lang = "en", name = "British Indian Ocean Territory"),
    "VG" to Country(lang = "en", name = "British Virgin Islands"),
    "BQ" to Country(lang = "nl", name = "Caribbean Netherlands"),
    "EC" to Country(lang = "es", name = "Ecuador"),
    "GU" to Country(lang = "en", name = "Guam"),
    "MH" to Country(lang = "en", name = "Marshall Islands"),
    "FM" to Country(lang = "en", name = "Federated States of Micronesia"),
    "MP" to Country(lang = "en", name = "Northern Mariana Islands"),
    "PW" to Country(lang = "en", name = "Palau"),
    "PR" to Country(lang = "es", name = "Puerto Rico"),
    "TL" to Country(lang = "pt", name = "Timor-Leste"),
    "TC" to Country(lang = "en", name = "Turks and Caicos Islands"),
    "VI" to Country(lang = "en", name = "U.S. Virgin Islands"),
    "UM" to Country(lang = "en", name = "United States Minor Outlying Islands"),
    "UY" to Country(lang = "es", name = "Uruguay"),
    "UZ" to Country(lang = "uz", name = "Uzbekistan"),
    "VE" to Country(lang = "es", name = "Venezuela"),
    "VN" to Country(lang = "vi", name = "Vietnam"),
    "VU" to Country(lang = "en", name = "Vanuatu"),
    "WS" to Country(lang = "en", name = "Samoa"),
    "CM" to Country(lang = "yav", name = "Cameroon"),
    "CF" to Country(lang = "sg", name = "Central African Republic"),
    "CG" to Country(lang = "fr", name = "Republic of the Congo"),
    "TD" to Country(lang = "fr", name = "Chad"),
    "GQ" to Country(lang = "fr", name = "Equatorial Guinea"),
    "GA" to Country(lang = "fr", name = "Gabon"),
    "AI" to Country(lang = "en", name = "Anguilla"),
    "AG" to Country(lang = "en", name = "Antigua and Barbuda"),
    "DM" to Country(lang = "en", name = "Dominica"),
    "GD" to Country(lang = "en", name = "Grenada"),
    "MS" to Country(lang = "en", name = "Montserrat"),
    "KN" to Country(lang = "en", name = "Saint Kitts and Nevis"),
    "LC" to Country(lang = "en", name = "Saint Lucia"),
    "VC" to Country(lang = "en", name = "Saint Vincent and the Grenadines"),
    "BJ" to Country(lang = "yo", name = "Benin"),
    "BF" to Country(lang = "fr", name = "Burkina Faso"),
    "CI" to Country(lang = "fr", name = "Côte d'Ivoire"),
    "GW" to Country(lang = "pt", name = "Guinea-Bissau"),
    "ML" to Country(lang = "khq", name = "Mali"),
    "NE" to Country(lang = "fr", name = "Niger"),
    "SN" to Country(lang = "wo", name = "Senegal"),
    "TG" to Country(lang = "ee", name = "Togo"),
    "PF" to Country(lang = "fr", name = "French Polynesia"),
    "NC" to Country(lang = "fr", name = "New Caledonia"),
    "WF" to Country(lang = "fr", name = "Wallis and Futuna"),
    "YE" to Country(lang = "ar", name = "Yemen"),
    "ZA" to Country(lang = "af", name = "South Africa"),
    "ZM" to Country(lang = "bem", name = "Zambia"),
    "ZW" to Country(lang = "en", name = "Zimbabwe"),
)

val CURRENCY_DATA = mapOf(
    "AED" to CurrencyData(num = 784, scale = 2, name = "United Arab Emirates dirham", symbol = "د.إ.", countryCodes = listOf("AE")),
    "AFN" to CurrencyData(num = 971, scale = 2, name = "Afghan afghani", symbol = "Af", countryCodes = listOf("AF")),
    "ALL" to CurrencyData(num = 8, scale = 2, name = "Albanian lek", symbol = "L", countryCodes = listOf("AL")),
    "AMD" to CurrencyData(num = 51, scale = 2, name = "Armenian dram", symbol = "֏", countryCodes = listOf("AM")),
    "ANG" to CurrencyData(num = 532, scale = 2, name = "Netherlands Antillean guilder", symbol = "ƒ", countryCodes = listOf("CW", "SX")),
    "AOA" to CurrencyData(num = 973, scale = 2, name = "Angolan kwanza", symbol = "Kz", countryCodes = listOf("AO")),
    "ARS" to CurrencyData(num = 32, scale = 2, name = "Argentine peso", symbol = "AR$", countryCodes = listOf("AR")),
    "AUD" to CurrencyData(num = 36, scale = 2, name = "Australian dollar", symbol = "AU$", countryCodes = listOf("AU", "CX", "CC", "HM", "KI", "NR", "NF", "TV")),
    "AWG" to CurrencyData(num = 533, scale = 2, name = "Aruban florin", symbol = "ƒ", countryCodes = listOf("AW")),
    "AZN" to CurrencyData(num = 944, scale = 2, name = "Azerbaijani manat", symbol = "ман", countryCodes = listOf("AZ")),
    "BAM" to CurrencyData(num = 977, scale = 2, name = "Bosnia and Herzegovina convertible mark", symbol = "KM", countryCodes = listOf("BA")),
    "BBD" to CurrencyData(num = 52, scale = 2, name = "Barbados dollar", symbol = "BBD$", countryCodes = listOf("BB")),
    "BDT" to CurrencyData(num = 50, scale = 2, name = "Bangladeshi taka", symbol = "৳", countryCodes = listOf("BD")),
    "BGN" to CurrencyData(num = 975, scale = 2, name = "Bulgarian lev", symbol = "лв.", countryCodes = listOf("BG")),
    "BHD" to CurrencyData(num = 48, scale = 3, name = "Bahraini dinar", symbol = "BD", countryCodes = listOf("BH")),
    "BIF" to CurrencyData(num = 108, scale = 0, name = "Burundian franc", symbol = "FBu", countryCodes = listOf("BI")),
    "BMD" to CurrencyData(num = 60, scale = 2, name = "Bermudian dollar", symbol = "$", countryCodes = listOf("BM")),
    "BND" to CurrencyData(num = 96, scale = 2, name = "Brunei dollar", symbol = "B$", countryCodes = listOf("BN")),
    "BOB" to CurrencyData(num = 68, scale = 2, name = "Boliviano", symbol = "Bs.", countryCodes = listOf("BO")),
    "BRL" to CurrencyData(num = 986, scale = 2, name = "Brazilian real", symbol = "R$", countryCodes = listOf("BR")),
    "BSD" to CurrencyData(num = 44, scale = 2, name = "Bahamian dollar", symbol = "$", countryCodes = listOf("BS")),
    "BTN" to CurrencyData(num = 64, scale = 2, name = "Bhutanese ngultrum", symbol = "Nu.", countryCodes = listOf("BT")),
    "BWP" to CurrencyData(num = 72, scale = 2, name = "Botswana pula", symbol = "P", countryCodes = listOf("BW")),
    "BYN" to CurrencyData(num = 933, scale = 2, name = "Belarusian ruble", symbol = "Br", countryCodes = listOf("BY")),
    "BZD" to CurrencyData(num = 84, scale = 2, name = "Belize dollar", symbol = "BZ$", countryCodes = listOf("BZ")),
    "CAD" to CurrencyData(num = 124, scale = 2, name = "Canadian dollar", symbol = "CA$", countryCodes = listOf("CA")),
    "CDF" to CurrencyData(num = 976, scale = 2, name = "Congolese franc", symbol = "FC", countryCodes = listOf("CD")),
    "CHF" to CurrencyData(num = 756, scale = 2, name = "Swiss franc", symbol = "Fr.", countryCodes = listOf("CH", "LI")),
    "CLP" to CurrencyData(num = 152, scale = 0, name = "Chilean peso", symbol = "CL$", countryCodes = listOf("CL")),
    "COP" to CurrencyData(num = 170, scale = 2, name = "Colombian peso", symbol = "CO$", countryCodes = listOf("CO")),
    "CRC" to CurrencyData(num = 188, scale = 2, name = "Costa Rican colon", symbol = "₡", countryCodes = listOf("CR")),
    "CUC" to CurrencyData(num = 931, scale = 2, name = "Cuban convertible peso", symbol = "CUC$", countryCodes = listOf("CU")),
    "CUP" to CurrencyData(num = 192, scale = 2, name = "Cuban peso", symbol = "${'$'}MN", countryCodes = listOf("CU")),
    "CVE" to CurrencyData(num = 132, scale = 2, name = "Cape Verdean escudo", symbol = "CV$", countryCodes = listOf("CV")),
    "CZK" to CurrencyData(num = 203, scale = 2, name = "Czech koruna", symbol = "Kč", countryCodes = listOf("CZ")),
    "DJF" to CurrencyData(num = 262, scale = 0, name = "Djiboutian franc", symbol = "Fdj", countryCodes = listOf("DJ")),
    "DKK" to CurrencyData(num = 208, scale = 2, name = "Danish krone", symbol = "kr.", countryCodes = listOf("DK", "FO", "GL")),
    "DOP" to CurrencyData(num = 214, scale = 2, name = "Dominican peso", symbol = "RD$", countryCodes = listOf("DO")),
    "DZD" to CurrencyData(num = 12, scale = 2, name = "Algerian dinar", symbol = "DA", countryCodes = listOf("DZ")),
    "EGP" to CurrencyData(num = 818, scale = 2, name = "Egyptian pound", symbol = "E£", countryCodes = listOf("EG")),
    "ERN" to CurrencyData(num = 232, scale = 2, name = "Eritrean nakfa", symbol = "Nkf", countryCodes = listOf("ER")),
    "ETB" to CurrencyData(num = 230, scale = 2, name = "Ethiopian birr", symbol = "Br", countryCodes = listOf("ET")),
    "EUR" to CurrencyData(
        num = 978,
        scale = 2,
        name = "Euro",
        symbol = "€",
        countryCodes = listOf(
            "AX",
            "AD",
            "AT",
            "BE",
            "CY",
            "EE",
            "FI",
            "FR",
            "TF",
            "DE",
            "GR",
            "GP",
            "IE",
            "IT",
            "LV",
            "LT",
            "LU",
            "MT",
            "GF",
            "MQ",
            "YT",
            "MC",
            "ME",
            "NL",
            "PT",
            "RE",
            "BL",
            "MF",
            "PM",
            "SM",
            "SK",
            "SI",
            "ES",
            "VA"
        )
    ),
    "FJD" to CurrencyData(num = 242, scale = 2, name = "Fijian dollar|Fiji dollar", symbol = "FJ$", countryCodes = listOf("FJ")),
    "FKP" to CurrencyData(num = 238, scale = 2, name = "Falkland Islands pound", symbol = "FK£", countryCodes = listOf("FK")),
    "GBP" to CurrencyData(num = 826, scale = 2, name = "Pound sterling", symbol = "£", countryCodes = listOf("GB", "IM", "JE", "GG")),
    "GEL" to CurrencyData(num = 981, scale = 2, name = "Georgian lari", symbol = "₾", countryCodes = listOf("GE")),
    "GHS" to CurrencyData(num = 936, scale = 2, name = "Ghanaian cedi", symbol = "GH₵", countryCodes = listOf("GH")),
    "GIP" to CurrencyData(num = 292, scale = 2, name = "Gibraltar pound", symbol = "£", countryCodes = listOf("GI")),
    "GMD" to CurrencyData(num = 270, scale = 2, name = "Gambian dalasi", symbol = "D", countryCodes = listOf("GM")),
    "GNF" to CurrencyData(num = 324, scale = 0, name = "Guinean franc", symbol = "FG", countryCodes = listOf("GN")),
    "GTQ" to CurrencyData(num = 320, scale = 2, name = "Guatemalan quetzal", symbol = "Q", countryCodes = listOf("GT")),
    "GYD" to CurrencyData(num = 328, scale = 2, name = "Guyanese dollar", symbol = "G$", countryCodes = listOf("GY")),
    "HKD" to CurrencyData(num = 344, scale = 2, name = "Hong Kong dollar", symbol = "HK$", countryCodes = listOf("HK")),
    "HNL" to CurrencyData(num = 340, scale = 2, name = "Honduran lempira", symbol = "L", countryCodes = listOf("HN")),
    "HRK" to CurrencyData(num = 191, scale = 2, name = "Croatian kuna", symbol = "kn", countryCodes = listOf("HR")),
    "HTG" to CurrencyData(num = 332, scale = 2, name = "Haitian gourde", symbol = "G", countryCodes = listOf("HT")),
    "HUF" to CurrencyData(num = 348, scale = 2, name = "Hungarian forint", symbol = "Ft", countryCodes = listOf("HU")),
    "IDR" to CurrencyData(num = 360, scale = 2, name = "Indonesian rupiah", symbol = "Rp", countryCodes = listOf("ID")),
    "ILS" to CurrencyData(num = 376, scale = 2, name = "Israeli new shekel", symbol = "₪", countryCodes = listOf("IL")),
    "INR" to CurrencyData(num = 356, scale = 2, name = "Indian rupee", symbol = "Rs.", countryCodes = listOf("IN", "BT")),
    "IQD" to CurrencyData(num = 368, scale = 3, name = "Iraqi dinar", symbol = "د.ع.", countryCodes = listOf("IQ")),
    "IRR" to CurrencyData(num = 364, scale = 2, name = "Iranian rial", symbol = "﷼", countryCodes = listOf("IR")),
    "ISK" to CurrencyData(num = 352, scale = 0, name = "Icelandic króna", symbol = "kr", countryCodes = listOf("IS")),
    "JMD" to CurrencyData(num = 388, scale = 2, name = "Jamaican dollar", symbol = "J$", countryCodes = listOf("JM")),
    "JOD" to CurrencyData(num = 400, scale = 3, name = "Jordanian dinar", symbol = "JD", countryCodes = listOf("JO")),
    "JPY" to CurrencyData(num = 392, scale = 0, name = "Japanese yen", symbol = "¥", countryCodes = listOf("JP")),
    "KES" to CurrencyData(num = 404, scale = 2, name = "Kenyan shilling", symbol = "KSh", countryCodes = listOf("KE")),
    "KGS" to CurrencyData(num = 417, scale = 2, name = "Kyrgyzstani som", symbol = "с", countryCodes = listOf("KG")),
    "KHR" to CurrencyData(num = 116, scale = 2, name = "Cambodian riel", symbol = "៛", countryCodes = listOf("KH")),
    "KMF" to CurrencyData(num = 174, scale = 0, name = "Comoro franc", symbol = "CF", countryCodes = listOf("KM")),
    "KPW" to CurrencyData(num = 408, scale = 2, name = "North Korean won", symbol = "₩", countryCodes = listOf("KP")),
    "KRW" to CurrencyData(num = 410, scale = 0, name = "South Korean won", symbol = "₩", countryCodes = listOf("KR")),
    "KWD" to CurrencyData(num = 414, scale = 3, name = "Kuwaiti dinar", symbol = "KD", countryCodes = listOf("KW")),
    "KYD" to CurrencyData(num = 136, scale = 2, name = "Cayman Islands dollar", symbol = "CI$", countryCodes = listOf("KY")),
    "KZT" to CurrencyData(num = 398, scale = 2, name = "Kazakhstani tenge", symbol = "₸", countryCodes = listOf("KZ")),
    "LAK" to CurrencyData(num = 418, scale = 2, name = "Lao kip", symbol = "₭N", countryCodes = listOf("LA")),
    "LBP" to CurrencyData(num = 422, scale = 2, name = "Lebanese pound", symbol = "LL.", countryCodes = listOf("LB")),
    "LKR" to CurrencyData(num = 144, scale = 2, name = "Sri Lankan rupee", symbol = "Rs.", countryCodes = listOf("LK")),
    "LRD" to CurrencyData(num = 430, scale = 2, name = "Liberian dollar", symbol = "L$", countryCodes = listOf("LR")),
    "LSL" to CurrencyData(num = 426, scale = 2, name = "Lesotho loti", symbol = "L", countryCodes = listOf("LS")),
    "LYD" to CurrencyData(num = 434, scale = 3, name = "Libyan dinar", symbol = "LD", countryCodes = listOf("LY")),
    "MAD" to CurrencyData(num = 504, scale = 2, name = "Moroccan dirham", symbol = "DH", countryCodes = listOf("MA", "EH")),
    "MDL" to CurrencyData(num = 498, scale = 2, name = "Moldovan leu", symbol = "L", countryCodes = listOf("MD")),
    "MGA" to CurrencyData(num = 969, scale = 2, name = "Malagasy ariary", symbol = "Ar", countryCodes = listOf("MG")),
    "MKD" to CurrencyData(num = 807, scale = 2, name = "Macedonian denar", symbol = "den", countryCodes = listOf("MK")),
    "MMK" to CurrencyData(num = 104, scale = 2, name = "Myanmar kyat", symbol = "Ks", countryCodes = listOf("MM")),
    "MNT" to CurrencyData(num = 496, scale = 2, name = "Mongolian tögrög", symbol = "₮", countryCodes = listOf("MN")),
    "MOP" to CurrencyData(num = 446, scale = 2, name = "Macanese pataca", symbol = "MOP$", countryCodes = listOf("MO")),
    "MRU" to CurrencyData(num = 929, scale = 2, name = "Mauritanian ouguiya", symbol = "UM", countryCodes = listOf("MR")),
    "MUR" to CurrencyData(num = 480, scale = 2, name = "Mauritian rupee", symbol = "Rs.", countryCodes = listOf("MU")),
    "MVR" to CurrencyData(num = 462, scale = 2, name = "Maldivian rufiyaa", symbol = "MRf", countryCodes = listOf("MV")),
    "MWK" to CurrencyData(num = 454, scale = 2, name = "Malawian kwacha", symbol = "MK", countryCodes = listOf("MW")),
    "MXN" to CurrencyData(num = 484, scale = 2, name = "Mexican peso", symbol = "MX$", countryCodes = listOf("MX")),
    "MYR" to CurrencyData(num = 458, scale = 2, name = "Malaysian ringgit", symbol = "RM", countryCodes = listOf("MY")),
    "MZN" to CurrencyData(num = 943, scale = 2, name = "Mozambican metical", symbol = "MTn", countryCodes = listOf("MZ")),
    "NAD" to CurrencyData(num = 516, scale = 2, name = "Namibian dollar", symbol = "N$", countryCodes = listOf("NA")),
    "NGN" to CurrencyData(num = 566, scale = 2, name = "Nigerian naira", symbol = "₦", countryCodes = listOf("NG")),
    "NIO" to CurrencyData(num = 558, scale = 2, name = "Nicaraguan córdoba", symbol = "C$", countryCodes = listOf("NI")),
    "NOK" to CurrencyData(num = 578, scale = 2, name = "Norwegian krone", symbol = "kr", countryCodes = listOf("NO", "SJ", "BV")),
    "NPR" to CurrencyData(num = 524, scale = 2, name = "Nepalese rupee", symbol = "Rs.", countryCodes = listOf("NP")),
    "NZD" to CurrencyData(num = 554, scale = 2, name = "New Zealand dollar", symbol = "NZ$", countryCodes = listOf("NZ", "CK", "NU", "PN", "TK")),
    "OMR" to CurrencyData(num = 512, scale = 3, name = "Omani rial", symbol = "OR", countryCodes = listOf("OM")),
    "PAB" to CurrencyData(num = 590, scale = 2, name = "Panamanian balboa", symbol = "B/.", countryCodes = listOf("PA")),
    "PEN" to CurrencyData(num = 604, scale = 2, name = "Peruvian sol", symbol = "S/.", countryCodes = listOf("PE")),
    "PGK" to CurrencyData(num = 598, scale = 2, name = "Papua New Guinean kina", symbol = "K", countryCodes = listOf("PG")),
    "PHP" to CurrencyData(num = 608, scale = 2, name = "Philippine peso", symbol = "₱", countryCodes = listOf("PH")),
    "PKR" to CurrencyData(num = 586, scale = 2, name = "Pakistani rupee", symbol = "Rs.", countryCodes = listOf("PK")),
    "PLN" to CurrencyData(num = 985, scale = 2, name = "Polish złoty", symbol = "zł", countryCodes = listOf("PL")),
    "PYG" to CurrencyData(num = 600, scale = 0, name = "Paraguayan guaraní", symbol = "₲", countryCodes = listOf("PY")),
    "QAR" to CurrencyData(num = 634, scale = 2, name = "Qatari riyal", symbol = "QR", countryCodes = listOf("QA")),
    "RON" to CurrencyData(num = 946, scale = 2, name = "Romanian leu", symbol = "L", countryCodes = listOf("RO")),
    "RSD" to CurrencyData(num = 941, scale = 2, name = "Serbian dinar", symbol = "din", countryCodes = listOf("RS")),
    "CNY" to CurrencyData(num = 156, scale = 2, name = "Renminbi", symbol = "CN¥", countryCodes = listOf("CN")),
    "RUB" to CurrencyData(num = 643, scale = 2, name = "Russian ruble", symbol = "₽", countryCodes = listOf("RU")),
    "RWF" to CurrencyData(num = 646, scale = 0, name = "Rwandan franc", symbol = "FRw", countryCodes = listOf("RW")),
    "SAR" to CurrencyData(num = 682, scale = 2, name = "Saudi riyal", symbol = "SR", countryCodes = listOf("SA")),
    "SBD" to CurrencyData(num = 90, scale = 2, name = "Solomon Islands dollar", symbol = "SI$", countryCodes = listOf("SB")),
    "SCR" to CurrencyData(num = 690, scale = 2, name = "Seychelles rupee", symbol = "Rs.", countryCodes = listOf("SC")),
    "SDG" to CurrencyData(num = 938, scale = 2, name = "Sudanese pound", symbol = "£SD", countryCodes = listOf("SD")),
    "SEK" to CurrencyData(num = 752, scale = 2, name = "Swedish krona", symbol = "kr", countryCodes = listOf("SE")),
    "SGD" to CurrencyData(num = 702, scale = 2, name = "Singapore dollar", symbol = "S$", countryCodes = listOf("SG")),
    "SHP" to CurrencyData(num = 654, scale = 2, name = "Saint Helena pound", symbol = "£", countryCodes = listOf("SH")),
    "SLL" to CurrencyData(num = 694, scale = 2, name = "Sierra Leonean leone", symbol = "Le", countryCodes = listOf("SL")),
    "SOS" to CurrencyData(num = 706, scale = 2, name = "Somali shilling", symbol = "Sh.So.", countryCodes = listOf("SO")),
    "SRD" to CurrencyData(num = 968, scale = 2, name = "Surinamese dollar", symbol = "Sr$", countryCodes = listOf("SR")),
    "SSP" to CurrencyData(num = 728, scale = 2, name = "South Sudanese pound", symbol = "SS£", countryCodes = listOf("SS")),
    "STN" to CurrencyData(num = 930, scale = 2, name = "São Tomé and Príncipe dobra", symbol = "Db", countryCodes = listOf("ST")),
    "SVC" to CurrencyData(num = 222, scale = 2, name = "Salvadoran colón", symbol = "₡", countryCodes = listOf("SV")),
    "SYP" to CurrencyData(num = 760, scale = 2, name = "Syrian pound", symbol = "LS", countryCodes = listOf("SY")),
    "SZL" to CurrencyData(num = 748, scale = 2, name = "Swazi lilangeni", symbol = "L", countryCodes = listOf("SZ")),
    "THB" to CurrencyData(num = 764, scale = 2, name = "Thai baht", symbol = "฿", countryCodes = listOf("TH")),
    "TJS" to CurrencyData(num = 972, scale = 2, name = "Tajikistani somoni", symbol = "SM", countryCodes = listOf("TJ")),
    "TMT" to CurrencyData(num = 934, scale = 2, name = "Turkmenistan manat", symbol = "m.", countryCodes = listOf("TM")),
    "TND" to CurrencyData(num = 788, scale = 3, name = "Tunisian dinar", symbol = "DT", countryCodes = listOf("TN")),
    "TOP" to CurrencyData(num = 776, scale = 2, name = "Tongan paʻanga", symbol = "T$", countryCodes = listOf("TO")),
    "TRY" to CurrencyData(num = 949, scale = 2, name = "Turkish lira", symbol = "TL", countryCodes = listOf("TR")),
    "TTD" to CurrencyData(num = 780, scale = 2, name = "Trinidad and Tobago dollar", symbol = "TT$", countryCodes = listOf("TT")),
    "TWD" to CurrencyData(num = 901, scale = 2, name = "New Taiwan dollar", symbol = "NT$", countryCodes = listOf("TW")),
    "TZS" to CurrencyData(num = 834, scale = 2, name = "Tanzanian shilling", symbol = "TSh", countryCodes = listOf("TZ")),
    "UAH" to CurrencyData(num = 980, scale = 2, name = "Ukrainian hryvnia", symbol = "₴", countryCodes = listOf("UA")),
    "UGX" to CurrencyData(num = 800, scale = 0, name = "Ugandan shilling", symbol = "USh", countryCodes = listOf("UG")),
    "USD" to CurrencyData(
        num = 840,
        scale = 2,
        name = "United States dollar",
        symbol = "$",
        countryCodes = listOf(
            "US",
            "AS",
            "IO",
            "VG",
            "BQ",
            "EC",
            "SV",
            "GU",
            "MH",
            "FM",
            "MP",
            "PW",
            "PA",
            "PR",
            "TL",
            "TC",
            "VI",
            "UM"
        )
    ),
    "UYU" to CurrencyData(num = 858, scale = 2, name = "Uruguayan peso", symbol = "${'$'}U", countryCodes = listOf("UY")),
    "UZS" to CurrencyData(num = 860, scale = 2, name = "Uzbekistan som", symbol = "сум", countryCodes = listOf("UZ")),
    "VED" to CurrencyData(num = 926, scale = 2, name = "Venezuelan bolívar|Venezuelan bolívar digital", symbol = "Bs.", countryCodes = listOf("VE")),
    "VES" to CurrencyData(num = 928, scale = 2, name = "Venezuelan bolívar|Venezuelan bolívar soberano", symbol = "Bs.F", countryCodes = listOf("VE")),
    "VND" to CurrencyData(num = 704, scale = 0, name = "Vietnamese đồng", symbol = "₫", countryCodes = listOf("VN")),
    "VUV" to CurrencyData(num = 548, scale = 0, name = "Vanuatu vatu", symbol = "VT", countryCodes = listOf("VU")),
    "WST" to CurrencyData(num = 882, scale = 2, name = "Samoan tala", symbol = "T", countryCodes = listOf("WS")),
    "XAF" to CurrencyData(num = 950, scale = 0, name = "Central African CFA franc|CFA franc BEAC", symbol = "Fr", countryCodes = listOf("CM", "CF", "CG", "TD", "GQ", "GA")),
    "XCD" to CurrencyData(num = 951, scale = 2, name = "East Caribbean dollar", symbol = "$", countryCodes = listOf("AI", "AG", "DM", "GD", "MS", "KN", "LC", "VC")),
    "XOF" to CurrencyData(num = 952, scale = 0, name = "West African CFA franc|CFA franc BCEAO", symbol = "₣", countryCodes = listOf("BJ", "BF", "CI", "GW", "ML", "NE", "SN", "TG")),
    "XPF" to CurrencyData(num = 953, scale = 0, name = "CFP franc ", symbol = "₣", countryCodes = listOf("PF", "NC", "WF")),
    "YER" to CurrencyData(num = 886, scale = 2, name = "Yemeni rial", symbol = "YR", countryCodes = listOf("YE")),
    "ZAR" to CurrencyData(num = 710, scale = 2, name = "South African rand", symbol = "R", countryCodes = listOf("SZ", "LS", "NA", "ZA")),
    "ZMW" to CurrencyData(num = 967, scale = 2, name = "Zambian kwacha", symbol = "ZK", countryCodes = listOf("ZM")),
    "ZWL" to CurrencyData(num = 932, scale = 2, name = "Zimbabwean dollar", symbol = "Z$", countryCodes = listOf("ZW")),
)

