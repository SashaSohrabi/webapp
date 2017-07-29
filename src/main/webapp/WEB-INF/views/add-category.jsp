<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>


<div class="container">
    Your New Action Item:
    <form method="POST" action="/add-category.do">
        <fieldset class="form-group">
            <label>Category</label> <input name="category" type="text"
                                           class="form-control"/> <BR/>
        </fieldset>
        <input name="add" type="submit" class="btn btn-success" value="Submit"/>
    </form>
</div>

<!--
<%@ include file="../common/footer.jspf" %>
-->