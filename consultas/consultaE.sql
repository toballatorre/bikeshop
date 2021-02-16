--  Consulta E
--  Reporte con el monto total vendido por cada vendedor
--  de la tienda Baldwin Bikes

SELECT staffs.last_name, staffs.first_name, SUM(order_items.quantity * order_items.list_price) MONTO  FROM stores
    INNER JOIN orders ON stores.store_id = orders.store_id
    INNER JOIN staffs ON staffs.staff_id = orders.staff_id
    INNER JOIN order_items ON orders.order_id = order_items.order_id
    WHERE stores.store_id = 2
    GROUP BY staffs.last_name, staffs.first_name
    ORDER BY MONTO DESC;