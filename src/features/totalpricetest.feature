Feature: Total Price API

  Scenario: To validate total price API with country, region and plu combinations
    Given total price API is called with currencyCode as "INR" and regionCode as "IN"
    Given total price API is called with currencyCode as "USD" and regionCode as "US"
    Given total price API is called with currencyCode as "AUD" and regionCode as "AU"
    Given total price API is called with currencyCode as "CAD" and regionCode as "CA"
    Given total price API is called with currencyCode as "CHF" and regionCode as "CH"
    Given total price API is called with currencyCode as "DKK" and regionCode as "DK"
    Given total price API is called with currencyCode as "EUR" and regionCode as "FR"
    Given total price API is called with currencyCode as "GBP" and regionCode as "GB"
    Given total price API is called with currencyCode as "HKD" and regionCode as "HK"
    Given total price API is called with currencyCode as "JPY" and regionCode as "JP"
    Given total price API is called with currencyCode as "MXN" and regionCode as "MX"
    Given total price API is called with currencyCode as "NOK" and regionCode as "NO"
    Given total price API is called with currencyCode as "NZD" and regionCode as "NZ"
    Given total price API is called with currencyCode as "SEK" and regionCode as "SE"