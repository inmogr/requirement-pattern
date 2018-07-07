$(document).ready(function() {
	$('input[type="file"]').change(function() {
		var file = this.files[0];
		var reader = new FileReader();
		reader.onloadend = function() {
			// $("#view-image-area").css('background-image', 'url(' + reader.result + ')');
			$("#view-image-area").attr('src', reader.result);
		}
		if (file) {
			var mimeType = this.files[0]['type'];
			if (mimeType.split('/')[0] != 'image') {
				alert("Pls select an image");
			} else {
				reader.readAsDataURL(file);
				$("#select-file-area").hide();
				$("#view-image-area").show();
			}
		} else {
			alert("here");
		}
	});
});