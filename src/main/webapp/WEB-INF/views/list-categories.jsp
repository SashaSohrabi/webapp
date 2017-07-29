<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<div class="container">
    <form action="/list-categories.do" method="post">
    <H1>Welcome ${name}</H1>
    <table class="table table-striped">
        <H4>Your Categories are</H4>

        <tbody>
        <c:forEach items="${categories}" var="category">
            <tr>
                <input type="submit"
                       value="${category.category}"/>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    </form>
</div>


<%@ include file="../common/footer.jspf" %>
