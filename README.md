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
        <!-- Adicionado: onsubmit="return validarSenhas()" -->
        <form action="#" method="POST" class="form-cadastro" onsubmit="return validarSenhas()">
            <h2>Criar Conta</h2>
            <p>Preencha os campos abaixo para se cadastrar.</p>

            <!-- Seção: Informações Pessoais -->
            <h3>Informações Pessoais</h3>

            <!-- Nome Completo -->
            <div class="grupo-input">
                <label for="nome">Nome Completo</label>
                <input type="text" id="nome" name="nome" placeholder="Digite seu nome" required>
            </div>

            
            <coloque uma foto do seu RG
            <div class="grupo-input">
                <label for="rg">Foto do RG</label>
                <input type="file" id="rg" name="rg" accept="image/*" required>
            </div>

            <!-- Data de Nascimento -->
            <div class="grupo-input">
                <label for="nascimento">Data de Nascimento</label>
                <input type="date" id="nascimento" name="nascimento" required>
            </div>

            <!-- CPF -->
            <div class="grupo-input">
                <label for="cpf">CPF</label>
                <input 
                    type="text" 
                    id="cpf" 
                    name="cpf" 
                    placeholder="000.000.000-00" 
                    maxlength="14" 
                    oninput="mascaraCPF(this)" 
                    required>
            </div>

            <!-- Gênero -->
            <div class="grupo-input">
                <label for="genero">Gênero</label>
                <select id="genero" name="genero" required>
                    <option value="">Selecione</option>
                    <option value="feminino">Feminino</option>
                    <option value="masculino">Masculino</option>
                    <option value="outro">Outro</option>
                </select>
            </div>

            <!-- Seção: Informações de Contato -->
            <h3>Informações de Contato</h3>
                    
            <!-- E-mail -->
            <div class="grupo-input">
                <label for="email">E-mail</label>
                <input type="email" id="email" name="email" placeholder="Digite seu e-mail" required>
            </div>

            <!-- Telefone -->
            <div class="grupo-input">
                <label for="telefone">Telefone</label>
                <input type="tel" id="telefone" name="telefone" placeholder="(00) 00000-0000" maxlength="15" oninput="mascaraTelefone(this)" required>
            </div>

            <!-- Telefone Secundário / Recado -->
            <div class="grupo-input">
                <label for="telefone_secundario">Telefone Secundário / Recado</label>
                <input type="tel" id="telefone_secundario" name="telefone_secundario" placeholder="(00) 00000-0000" maxlength="15" oninput="mascaraTelefone(this)">
            </div>

            <!-- Seção: Endereço -->
            <h3>Endereço</h3>

            <!-- CEP -->
            <div class="grupo-input">
                <label for="cep">CEP</label>
                <input 
                    type="text" 
                    id="cep" 
                    name="cep" 
                    placeholder="00000-000" 
                    maxlength="9" 
                    oninput="mascaraCEP(this)" 
                    onblur="buscarCEP(this.value)"
                    required>
            </div>

            <!-- Rua / Avenida -->
            <div class="grupo-input">
                <label for="rua">Rua / Avenida</label>
                <input type="text" id="rua" name="rua" placeholder="Digite o nome da rua ou avenida" required>
            </div>

            <!-- Número (Aceita apenas números) -->
            <div class="grupo-input">
                    <label for="numero">Número</label>
                     <input 
                     type="text" 
                    id="numero" 
                     name="numero" 
                    placeholder="Digite o número" 
                     inputmode="numeric"
                 oninput="this.value = this.value.replace(/\D/g, '')" 
                 required>
</div>
            </div>

            <!-- Complemento -->
            <div class="grupo-input">
                <label for="complemento">Complemento</label>
                <input type="text" id="complemento" name="complemento" placeholder="Digite o complemento (opcional)">
            </div>

            <!-- Bairro -->
            <div class="grupo-input">
                <label for="bairro">Bairro</label>
                <input type="text" id="bairro" name="bairro" placeholder="Digite o nome do bairro" required>
            </div>

            <!-- Cidade -->
            <div class="grupo-input">
                <label for="cidade">Cidade</label>
                <input type="text" id="cidade" name="cidade" placeholder="Digite o nome da cidade" required>
            </div>

            <!-- Estado -->
            <div class="grupo-input">
                <label for="estado">Estado</label>
                <select id="estado" name="estado" required>
                    <option value="">Selecione</option>
                    <option value="AC">Acre</option>
                    <option value="AL">Alagoas</option>
                    <option value="AP">Amapá</option>
                    <option value="AM">Amazonas</option>
                    <option value="BA">Bahia</option>
                    <option value="CE">Ceará</option>
                    <option value="DF">Distrito Federal</option>
                    <option value="ES">Espírito Santo</option>
                    <option value="GO">Goiás</option>
                    <option value="MA">Maranhão</option>
                    <option value="MT">Mato Grosso</option>
                    <option value="MS">Mato Grosso do Sul</option>
                    <option value="MG">Minas Gerais</option>
                    <option value="PA">Pará</option>
                    <option value="PB">Paraíba</option>
                    <option value="PR">Paraná</option>
                    <option value="PE">Pernambuco</option>
                    <option value="PI">Piauí</option>
                    <option value="RJ">Rio de Janeiro</option>
                    <option value="RN">Rio Grande do Norte</option>
                    <option value="RS">Rio Grande do Sul</option>
                    <option value="RO">Rondônia</option>
                    <option value="RR">Roraima</option>
                    <option value="SC">Santa Catarina</option>
                    <option value="SP">São Paulo</option>
                    <option value="SE">Sergipe</option>
                    <option value="TO">Tocantins</option>
                </select>
            </div>

            <!-- Dados de Acesso -->
            <h3>Dados de Acesso (para sistemas digitais)</h3>

            <div class="grupo-input">
                <label for="username">Nome de Usuário (Login)</label>
                <input type="text" id="username" name="username" placeholder="Digite seu nome de usuário" required>
            </div>

            <div class="grupo-input">
                <label for="senha">Senha</label>
                <input type="password" id="senha" name="senha" placeholder="Digite sua senha" required>
            </div>

            <div class="grupo-input">
                <label for="confirmar-senha">Confirmar Senha</label>
                <input type="password" id="confirmar-senha" name="confirmar-senha" placeholder="Digite sua senha novamente" required>
            </div>

            <!-- Termos e Autorizações -->
            <div class="grupo-input">
                <label>
                    <input type="checkbox" name="termos" required>
                    Li e concordo com os <a href="#" target="_blank">Termos de Uso</a> e a <a href="#" target="_blank">Política de Privacidade</a>
                </label>
            </div>

            <div class="grupo-input">
                <label>
                    <input type="checkbox" name="autorizacao" required>
                    Aceito receber novidades e comunicações por e-mail e/ou WhatsApp.
                </label>
            </div>

              <!-- Data do envio -->
            <div class="grupo-input">
                <label for="data-envio">Data do Envio</label>
                <input type="date" id="data-envio" name="data-envio" required>
            </div>

            <!-- Botão Enviar -->
            <button type="submit" class="btn-enviar">Cadastrar</button>
        </form>
    </div>

    <!-- Scripts de Máscaras e Validação -->
    <script>
        // Máscara para CPF (000.000.000-00)
        function mascaraCPF(input) {
            let valor = input.value.replace(/\D/g, "");
            valor = valor.replace(/(\d{3})(\d)/, "$1.$2");
            valor = valor.replace(/(\d{3})(\d)/, "$1.$2");
            valor = valor.replace(/(\d{3})(\d{1,2})$/, "$1-$2");
            input.value = valor;
        }

        // Máscara para Telefone ((00) 00000-0000)
        function mascaraTelefone(input) {
            let valor = input.value.replace(/\D/g, "");
            valor = valor.replace(/^(\d{2})(\d)/g, "($1) $2");
            valor = valor.replace(/(\d{5})(\d)/, "$1-$2");
            input.value = valor;
        }

        // Máscara para CEP (00000-000)
        function mascaraCEP(input) {
            let valor = input.value.replace(/\D/g, "");
            valor = valor.replace(/^(\d{5})(\d)/, "$1-$2");
            input.value = valor;
        }

        // Busca de Endereço Automática pelo CEP
        function buscarCEP(valorCep) {
            const cepLimpo = valorCep.replace(/\D/g, "");
            if (cepLimpo.length === 8) {
                fetch(`https://viacep.com.br/ws/${cepLimpo}/json/`)
                    .then(res => res.json())
                    .then(dados => {
                        if (!dados.erro) {
                            document.getElementById("rua").value = dados.logradouro || "";
                            document.getElementById("bairro").value = dados.bairro || "";
                            document.getElementById("cidade").value = dados.localidade || "";
                            document.getElementById("estado").value = dados.uf || "";
                            document.getElementById("numero").focus();
                        }
                    })
                    .catch(err => console.error("Erro ao buscar CEP:", err));
            }
        }

        // Validação de Senhas
        function validarSenhas() {
            const senha = document.getElementById("senha").value;
            const confirmacaoSenha = document.getElementById("confirmar-senha").value;

            if (senha !== confirmacaoSenha) {
                alert("As senhas não coincidem! Por favor, digite novamente.");
                document.getElementById("confirmar-senha").focus();
                return false; // Bloqueia o envio do formulário
            }

            return true; // Permite o envio
        }
    </script>
</body>
</html>
