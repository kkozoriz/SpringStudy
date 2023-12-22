<!DOCTYPE html>
<html lang="en">
<head>
    <title>
        PROJECT
    </title>
</head>
<body>
<h1>
    BUYSELL
</h1>
<hr>
<h4>Подробная информация о товаре</h4>
<b>Название товара: ${product.title}</b>
<b>Описание товара: ${product.description}</b>
<b>Цена: ${product.price}</b>
<b>Город: ${product.city}</b>
<b>Автор: ${product.author}</b>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" , value="Удалить товар">
</form>
</body>
</html>