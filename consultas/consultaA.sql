--  Consulta A
--  Listado de clientes del estado de New York 'NY' ordenados alfabeticamente
--  por apellido y nombre.
SELECT customer_id, last_name, first_name, phone, email, street, city, state, customers.zip_code
    FROM customers
    WHERE state = 'NY'
    ORDER BY last_name, first_name ASC;