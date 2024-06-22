function showResponse(feeling) {
    const responseElement = document.getElementById('response');
    if (feeling === 'good') {
        responseElement.textContent = 'I\'m glad to hear that!';
        responseElement.style.color = '#4CAF50';
    } else {
        responseElement.textContent = 'I\'m sorry to hear that. I hope things get better!';
        responseElement.style.color = '#f44336';
    }
    responseElement.classList.add('show');
}

// Optional: Add a little animation to the container when the page loads
window.onload = function() {
    document.querySelector('.container').style.transform = 'scale(1)';
};
