<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:template title="Cadastrar e avaliar produto">
    <jsp:body>
        <h2 class="main-text">Cadastrar e avaliar produto</h2>
        <div>
            <form class="form-register" id="form" action="worth-it/cadastrar-avaliar-produto" method="post">
                <div class="left-form">
                    <h3 class="register-text">Seu nome ou apelido:</h3>
                    <br>
                    <input class="register-input" type="text" maxlength="20"  placeholder="digite aqui o seu nome ou apelido" name="user-name">
                    <br>
                    <h3 class="register-text">Nome do produto:</h3>
                    <br>
                    <input class="register-input" type="text" maxlength="50"  placeholder="digite aqui o nome do produto" name="product-name">
                    <br>
                    <h3 class="register-text">Categoria do produto:</h3>
                    <br>
                    <select class="register-input" id="category" name="category">
                        <option selected="selected" value="celular">Celular</option>
                        <option value="computador">Computador</option>
                        <option value="teclado">Teclado</option>
                        <option value="mouse">Mouse</option>
                        <option value="videogame">Videogame</option>
                        <option value="controle">Controle</option>
                        <option value="camera">Câmera</option>
                        <option value="fone de ouvido">Fone de ouvido</option>
                        <option value="impressora">Impressora</option>
                        <option value="relogio">Relógio</option>
                        <option value="televisao">Televisão</option>
                    </select>
                    <br>
                    <h3 class="register-text">Gostou do produto?</h3>
                    <br>
                    <select class="register-input" id="likes" name="likes">
                        <option selected="selected" value="gostei do produto">Gostei do produto</option>
                        <option value="nao gostei do produto">Não gostei do produto</option>
                    </select>
                    <br>
                </div>
                <div class="right-form">
                    <h3 class="register-text">Avaliação do produto:</h3>
                    <textarea class="register-input" name="review" maxlength="300" rows="15" cols="50" placeholder="opine brevemente sobre o produto"></textarea>
                    <br>
                    <button>Avaliar produto</button>
                </div>
            </form>
        </div>
    </jsp:body>
</t:template>