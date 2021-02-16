--  Consulta C
--  Reporte con la cantidad de ordenes totales de cada tienda, ordenado de
--  mayor a menor.

SELECT stores.store_name, COUNT(*) FROM stores
    INNER JOIN orders ON stores.store_id = orders.store_id
    GROUP BY stores.store_name
    ORDER BY COUNT(*) DESC;