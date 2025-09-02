INSERT INTO EXPENSES.CATEGORY (
    CATEGORY
) VALUES ('AGUA');

INSERT INTO EXPENSES.CATEGORY (
    CATEGORY
) VALUES (
'LUZ');

INSERT INTO EXPENSES.CATEGORY (
    CATEGORY
) VALUES ('GAS');


INSERT INTO EXPENSES.EXPENSE (EXECUTE_EXPENSE_DATE,
                              AMOUNT,
                              FIXED_EXPENSE,
                              RESOURCE,
                              IS_DIVISIBLE,
                              ID_CATEGORY
) VALUES (DATE '2025-05-18',
          10000,
          TRUE,
          'Cuenta de banco',
          FALSE,
          1   );

INSERT INTO EXPENSES.EXPENSE (EXECUTE_EXPENSE_DATE,
                              AMOUNT,
                              FIXED_EXPENSE,
                              RESOURCE,
                              IS_DIVISIBLE,
                              ID_CATEGORY
) VALUES (DATE '2025-05-19',
          20000,
          TRUE,
          'Comida en restaurante',
          FALSE,
          2   );

INSERT INTO EXPENSES.EXPENSE (EXECUTE_EXPENSE_DATE,
                              AMOUNT,
                              FIXED_EXPENSE,
                              RESOURCE,
                              IS_DIVISIBLE,
                              ID_CATEGORY
) VALUES (DATE '2025-05-20',
          30000,
          TRUE,
          'Paseo',
          FALSE,
          3   );


