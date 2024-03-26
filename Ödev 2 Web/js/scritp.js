$(document).ready(function() {
    $('#kayitFormu').submit(function(event) {
      event.preventDefault();
      
      var eposta = $('#eposta').val();
      var ad = $('#ad').val();
      var soyad = $('#soyad').val();
      var cepTelefonu = $('#cepTelefonu').val();
      var sifre = $('#sifre').val();
      var sifreTekrar = $('#sifreTekrar').val();
      
      // E Posta Doğrulama
      var regex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
      if (!regex.test(eposta)) {
        alert("Lütfen geçerli bir e-posta adresi giriniz.");
        return;
      }
      
      // Boş Alan Kontrolü
      if (ad === '' || soyad === '' || cepTelefonu === '' || sifre === '' || sifreTekrar === '') {
        alert("Lütfen tüm alanları doldurunuz.");
        return;
      }
      
      // Şifreler Aynı mı
      if (sifre !== sifreTekrar) {
        alert("Girdiğiniz şifreler birbiriyle uyuşmuyor.");
        return;
      }
      
      // Bilgileri Gösterme
      alert("Kayıt başarıyla tamamlandı!\n\nE-posta: " + eposta + "\nAd: " + ad + "\nSoyad: " + soyad + "\nCep Telefonu: " + cepTelefonu);
      window.location.href = "sayfa2.html"; // İkinci sayfaya yönlendirme
    });
  });
  