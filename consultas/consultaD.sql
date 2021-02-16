--  Consulta D
--  Reporte con la cantidad de ordenes asociados a cada uno de los vendedores
--  de la tienda en Baldwin Bikes.

SELECT staffs.last_name, staffs.first_name, COUNT(*) FROM stores
    INNER JOIN orders ON stores.store_id = orders.store_id
    INNER JOIN staffs ON staffs.staff_id = orders.staff_id
    WHERE stores.store_id = 2
    GROUP BY staffs.last_name, staffs.first_name
    ORDER BY COUNT(*) DESC;