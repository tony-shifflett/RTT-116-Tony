-- which product did we sell the most of?   I would like to see the number of orders, the total amount sold, and the product name
SELECT p.product_name AS Product, SUM(od.quantity_ordered) AS Quantity 
FROM orderdetails od
JOIN products p ON od.product_id = p.id
GROUP BY p.product_name
ORDER BY Quantity DESC;

-- which product generated the most profit by year.  In the result I want to see the year, the product name, and the total profit.  order by year desc, profit desc
SELECT 
EXTRACT(YEAR FROM o.order_date) AS Year,
p.product_name,
SUM(od.quantity_ordered * (od.price_each - p.buy_price)) AS Profit
FROM orderdetails od
JOIN orders o ON od.order_id = o.id
JOIN products p ON od.product_id = p.id
GROUP BY
Year, p.product_name
ORDER BY 
year DESC, Profit DESC;

-- Optional: which office is the most profitable?   result should show the name of the office and the total profit for that office orderd by profit descending
SELECT 
o.city AS Office, 
SUM(od.quantity_ordered * (od.price_each - p.buy_price)) AS Profit
FROM orderdetails od
JOIN orders ord ON od.order_id = ord.id
JOIN products p ON od.product_id = p.id
JOIN customers c ON ord.customer_id = c.id
JOIN employees e ON c.sales_rep_employee_id = e.id
JOIN offices o ON e.office_id = o.id
GROUP BY o.city
ORDER BY Profit DESC;

-- Optional:  Show me all the customers that have an outstanding balance due... would have to sum the payments for the customer and compare the total amount paid to the total amount purchased.
SELECT 
c.customer_name AS Customer, 
SUM(od.quantity_ordered * od.price_each) AS Due, 
COALESCE(SUM(p.amount), 0) AS Paid, 
SUM(od.quantity_ordered * od.price_each) - COALESCE(SUM(p.amount), 0) AS Balance
FROM customers c
JOIN orders o on c.id = o.customer_id
JOIN orderdetails od ON o.id = od.order_id
LEFT JOIN payments p ON c.id = p.customer_id
GROUP BY c.id, c.customer_name
HAVING Balance > 0
ORDER BY Balance DESC; 

