<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html> 
<head> 
<title> Ödev4 </title> 
<script>
    function showProgress() {
        var progress = document.getElementById('progress');
        var uploadButton = document.getElementById('uploadButton');
        var fileInput = document.getElementById('resim');

        if (fileInput.files.length > 0) {
            var file = fileInput.files[0];
            var fileSize = file.size;
            var speed = 25000;

            var totalSeconds = fileSize / speed;
            var remainingSeconds = totalSeconds;

            var progressInterval = setInterval(function() {
                remainingSeconds--;
                var progressPercentage = ((totalSeconds - remainingSeconds) / totalSeconds) * 100;
                progress.value = progressPercentage;

                if (remainingSeconds <= 0) {
                    clearInterval(progressInterval);
                    progress.value = 100;
                    uploadButton.disabled = false;
                }
            }, 1000);
        }
    }
</script>
</head> 
<body>

  <form method="post" action="UpdatePhoto" enctype="multipart/form-data">
    <input type="file" name="file" id="resim" accept="image/*" onchange="showProgress()"><br><br>
    <progress id="progress" value="0" max="100"></progress><br><br>
    <input type="submit" id="uploadButton" value="Gönder" disabled>
  </form>

</body>
</html>