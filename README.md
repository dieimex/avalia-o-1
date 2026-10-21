<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário de Cadastro</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <div class="container">
        <form action="#" method="POST" class="form-cadastro">
            <h2>Criar Conta</h2>
            <p>Preencha os campos abaixo para se cadastrar.</p>

            <!-- Nome Completo -->
            <div class="grupo-input">
                <label for="nome">Nome Completo</label>
                <input type="text" id="nome" name="nome" placeholder="Digite seu nome" required>
            </div>

            <!-- E-mail -->
            <div class="grupo-input">
                <label for="email">E-mail</label>
                <input type="email" id="email" name="email" placeholder="seu@email.com" required>
            </div>

            <!-- Telefone (Apenas números + Teclado Numérico Mobile) -->
            <div class="grupo-input">
                <label for="telefone">Telefone</label>
                <input 
                    type="text" 
                    id="telefone" 
                    name="telefone" 
                    inputmode="numeric" 
                    pattern="[0-9]*" 
                    oninput="this.value = this.value.replace(/[^0-9]/g, '')"
                    placeholder="00900000000"
                >
            </div>

            <!-- CPF (Apenas números + Teclado Numérico Mobile) -->
            <div class="grupo-input">
                <label for="cpf">CPF</label>
                <input 
                    type="text" 
                    id="cpf" 
                    name="cpf" 
                    inputmode="numeric" 
                    pattern="[0-9]*" 
                    oninput="this.value = this.value.replace(/[^0-9]/g, '')"
                    maxlength="11" 
                    placeholder="Digite apenas números" 
                    required
                >
            </div>

            <!-- Nome do Pai -->
            <div class="grupo-input">
                <label for="nome_pai">Nome do Pai</label>
                <input type="text" id="nome_pai" name="nome_pai" placeholder="Digite o nome do responsável">
            </div>

            <!-- Nome da Mãe -->
            <div class="grupo-input">
                <label for="nome_mae">Nome da Mãe</label>
                <input type="text" id="nome_mae" name="nome_mae" placeholder="Digite o nome da responsável">
            </div> 

            <!-- Endereço -->
            <div class="grupo-input">
                <label for="endereco">Endereço</label>
                <input type="text" id="endereco" name="endereco" placeholder="Digite seu Endereço" required>
            </div>

            <button type="submit" class="btn-enviar">Cadastrar</button>
        </form>
    </div>

</body>
</html>
