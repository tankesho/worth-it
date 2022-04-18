<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:template title="Avaliar produto">
  <jsp:body>
    <h2  class="main-text" id="review-title"></h2>
    <div class="form-register">
      <form class="form-register" id="form" action="worth-it/cadastrar-avaliar-produto" method="post">
        <div class="left-form">
          <h3 class="register-text">Seu nome ou apelido:</h3>
          <br>
          <input class="register-input"  id="user"  maxlength="20" type="text" placeholder="digite aqui o seu nome ou apelido" name="user-name">
          <br>
          <h3 class="register-text">Gostou do produto?</h3>
          <br>
          <select  class="register-input"  id="likes" name="likes">
            <option selected="selected" value="gostei do produto">gostei do produto</option>
            <option value="nao gostei do produto">não gostei do produto</option>
          </select>
          <br>
        </div>
        <div class="right-form">
          <h3 class="register-text">Avaliação do produto:</h3>
          <textarea id="review"  name="review" maxlength="300" rows="10" cols="50" placeholder="opine brevemente sobre o produto"></textarea>
          <br>
          <input type="hidden" value="${id}" name="id">
          <input type="hidden" value="a" name="option">
          <button>Avaliar produto</button>
        </div>
      </form>
    </div>
    <script>
      $("#review-title").html("Avaliar " + localStorage.getItem("productName"))
    </script>
  </jsp:body>
</t:template>