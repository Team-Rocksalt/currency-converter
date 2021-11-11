# Currency Converter Application

## Description

This is a simple application that can calculate a given amount in one currency in another currency. 

The application should take as an input:
* the _SOURCE_ currency: currency in which an amount is provided - see below
* the _TARGET_ currency: currency for which the amount is to be calculated
* the _AMOUNT_ to be converted: a numeric input (with decimals) representing the amount in _SOURCE_ currency to be converted to _TARGET_ currency

### Currency conversion values

The application is initialized with a static set of currency conversion values which are used for the calculation:

| Source Currency | Target Currency | Conversion rate |
|-----------------|-----------------|-----------------|
| EUR             | USD             | 1.14            |
| USD             | EUR             | 0.87            |
| EUR             | GBP             | 0.85            |
| GBP             | EUR             | 1.16            |
| USD             | GBP             | 0.74            |
| GBP             | USD             | 1.34            |

## Testing
Below you can find some conversion values that can be used for your testing.

| Source Currency | Target Currency | Amount in source currency | Converted amount |
|-----------------|-----------------|---------------------------|------------------|
| EUR             | GBP             | 100.00                    | 85.ßß            |
| USD             | EUR             | 11                        | 9.57             |
| GBP             | USD             | 124.15                    | 166.36           |


## Now, suppose the following situation...

A former developer in our company was assigned with a task to write this application.
Unfortunately, this developer could not finish the implementation.

As a new developer in the company, you are tasked to finish implementing the application following the best software engineering practices in order to deliver a quality product. 
