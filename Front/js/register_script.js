// register_script.js
document.addEventListener('DOMContentLoaded', function () {
  const registerForm = document.getElementById('register-form');

  if (registerForm) {
    registerForm.addEventListener('submit', function (e) {
      const email = document.getElementById('email').value.trim();
      const password = document.getElementById('password').value;
      const confirmPassword = document.getElementById('confirm-password').value;

      console.log("Tentativa de cadastro:");
      console.log("Email:", email);
      console.log("Senha:", password);
      console.log("Confirmação de senha:", confirmPassword);

      if (!email.includes('@')) {
        alert('Por favor, insira um e-mail válido.');
        e.preventDefault();
        return;
      }

      if (password.length < 6) {
        alert('A senha deve ter pelo menos 6 caracteres.');
        e.preventDefault();
        return;
      }

      if (password !== confirmPassword) {
        alert('As senhas não coincidem.');
        e.preventDefault();
      }
    });
  }
});
