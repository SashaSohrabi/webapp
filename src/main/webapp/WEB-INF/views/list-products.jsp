<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="container">
    <H1>Welcome ${name}</H1>


    <table class="table table-striped">
        <caption>Your Products are</caption>
        <thead>
        <th>Description</th>
        <th>Category</th>
        <th>Actions</th>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.name}</td>
                <td>${product.category}</td>
                <td>&nbsp;&nbsp;<a class="btn btn-danger"
                                   href="/delete-product.do?product=${product.name}&category=${product.category}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <p>
        <font color="red">${errorMessage}</font>
    </p>
    <a class="btn btn-success" href="/add-product.do">Add New Product</a>
</div>

<!-- <%@ include file="../common/footer.jspf"%> -->