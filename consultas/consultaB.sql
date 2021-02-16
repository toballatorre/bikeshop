--  Consulta B
--  Listado de clientes del estado de New York 'NY' ordenados alfabeticamente
--  por apellido y nombre sin teléfonos y correos yahoo.
SELECT customer_id, last_name, first_name, phone, email, street, city, state, customers.zip_code
    FROM customers
    WHERE state = 'NY' AND phone IS NULL AND email LIKE '%yahoo%'
    ORDER BY last_name, first_name ASC;