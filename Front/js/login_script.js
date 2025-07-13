// login_script.js
document.addEventListener('DOMContentLoaded', function () {
  const loginForm = document.getElementById('login-form');

  if (loginForm) {
    loginForm.addEventListener('submit', function (e) {
      const email = document.getElementById('email').value.trim();
      const password = document.getElementById('password').value;

      console.log("Tentativa de login:");
      console.log("Email:", email);
      console.log("Senha:", password);

      // Validação básica de email
      if (!formData.username || !formData.username.includes('@')) {
        alert('Digite um e-mail válido para entrar.');
        e.preventDefault();
      }
    });
  }
});
