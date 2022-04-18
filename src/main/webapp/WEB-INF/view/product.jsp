<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:template title="Produto">
        <jsp:body>
            <div class="product-title">
                <h2>${product.name}</h2>
            </div>
            <div class="likes-price-product">
                <div class="likes-product">
                    <h2>Avaliações: ${likes}</h2>
                </div>
                <div class="review-button-div">
                    <form action="worth-it/avaliar-produto" method="post">
                        <input type="hidden" value="${product.id}" name="id">
                        <button class="review-button">Avaliar produto</button>
                    </form>
                </div>
            </div>
            <div class="reviews">
                <h2>Avaliações deste produto por outros usuários</h2>
                <c:forEach var="review" items="${reviews}">
                    <div class="review">
                        <div class="user-liked-review">
                            <div class="user-review">
                                <h3>${review.user}</h3>
                            </div>
                            <div class="liked-review">
                                <h3>${review.likes}</h3>
                            </div>
                        </div>
                        <div>
                            <p>${review.review}</p>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <script>
                localStorage.setItem("productName", "${product.name}");
            </script>
    </jsp:body>
</t:template>