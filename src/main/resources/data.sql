INSERT INTO EXPENSES.CATEGORY (
                               ID,
    CATEGORY
) VALUES (
             1,'AGUA');

INSERT INTO EXPENSES.CATEGORY (
    ID,
    CATEGORY
) VALUES (
             2,'LUZ');

INSERT INTO EXPENSES.CATEGORY (
    ID,
    CATEGORY
) VALUES (
             3,'GAS');


INSERT INTO EXPENSES.EXPENSE (ID,
                              EXECUTE_EXPENSE_DATE,
                              AMOUNT,
                              FIXED_EXPENSE,
                              RESOURCE,
                              IS_DIVISIBLE,
                              ID_CATEGORY
) VALUES (1 ,
          DATE '2025-05-18',
          10000,
          TRUE,
          'Cuenta de banco',
          FALSE,
          1   );

INSERT INTO EXPENSES.EXPENSE (ID,
                              EXECUTE_EXPENSE_DATE,
                              AMOUNT,
                              FIXED_EXPENSE,
                              RESOURCE,
                              IS_DIVISIBLE,
                              ID_CATEGORY
) VALUES (2 ,
          DATE '2025-05-19',
          20000,
          TRUE,
          'Comida en restaurante',
          FALSE,
          2   );

INSERT INTO EXPENSES.EXPENSE (ID,
                              EXECUTE_EXPENSE_DATE,
                              AMOUNT,
                              FIXED_EXPENSE,
                              RESOURCE,
                              IS_DIVISIBLE,
                              ID_CATEGORY
) VALUES (3 ,
          DATE '2025-05-20',
          30000,
          TRUE,
          'Paseo',
          FALSE,
          3   );


