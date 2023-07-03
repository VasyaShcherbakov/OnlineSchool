FROM
    name
    lectures_name
        INNER JOIN orderdetails
                   ON products.product_сode = orderdetails.product_code
ORDER BY product_name;



FROM
    name
    second_name
     year
        INNER JOIN orderdetails
                   ON second_name = name
ORDER BY product_name;


SELECT
    lectures_name
    cource_name
FROM
    name
        RIGHT JOIN online_scool
                   ON online_scool.lectures_name = product_сode
ORDER BY lectures_name;