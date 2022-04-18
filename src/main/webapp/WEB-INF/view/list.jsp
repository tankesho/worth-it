<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:template title="Produtos">
    <jsp:body>
        <c:if test="${category != '' || name != null}">
            <h2 class="main-text">Busca por: ${category}${name}</h2>
        </c:if>
        <c:if test="${category == '' && name == null}">
            <h2 class="main-text">Busca por: ${searchAll}</h2>
        </c:if>
        <c:if test="${not empty products}">
            <div class="table">
                <table>
                    <tr>
                        <th class="table-product-buttom-title"></th>
                        <th class="table-product-name-title">Nome</th>
                        <th class="table-product-category-title">Categoria</th>
                        <th class="table-product-like-title">Avaliações</th>
                    </tr>
                    <c:forEach var="product" items="${products}" varStatus="loop">
                        <tr>
                            <td class="table-product-buttom">
                            <form action="worth-it/calcular-avaliacoes" method="post">
                                <input type="hidden" value="${product.id}" name="id">
                                <button>Detalhes</button>
                            </form>
                            </td>
                            <td class="table-product-name">${product.name}</td>
                            <td class="table-product-category">${product.category}</td>
                            <td class="table-product-like">${likes[loop.index]}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </c:if>
        <c:if test="${empty products}">
            <h3>Não há nenhum produto corresponde aos dados fornecidos.</h3>
        </c:if>
    </jsp:body>
</t:template>