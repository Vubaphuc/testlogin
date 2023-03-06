const loginForm = document.getElementById('login');

loginForm.addEventListener('submit', (event) => {
  event.preventDefault();

  const formData = new FormData(loginForm);
  const userName = formData.get('userName');
  const password = formData.get('password');

  fetch('/login', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({
      userName,
      password
    })
  })
  .then(response => response.json())
  .then(data => {
    // Xử lý kết quả trả về
  })
  .catch(error => {
    // Xử lý lỗi
  });
});
