window.onload = function(){
				var img = document.getElementById("picture").getElementsByTagName("img");
				var table = document.getElementById("picture").getElementsByTagName("table");
				var index = 0;
				var myTimer = null;
				var flag = true;
				img[index].style.opacity = 1;
				table[index].style.background = "#FFF";
				
				myTimer = setInterval(move,3000);
				
				for(var i=0;i<table.length;i++){
					table[i].tabIndex = i;
					table[i].onclick = function(){
						//1、阻止用户连续点击table时，图片淡入淡出的重叠。也就是说：动画没有播放完毕，用户点击无效。
						if(flag){
							flag = false;
						}else{
							return null;
						}
						clearInterval(myTimer);
						index = this.tabIndex;
						init();
						//img[this.tabIndex].style.opacity = 1;
						donghua(this.tabIndex);
						this.style.background = "#FFF";
						myTimer = setInterval(move,3000);
					}
				}
				
				function move(){
					if(index==7){
						index = 0;
					}else{
						index++;
					}
					init();
					//img[index].style.opacity = 1;
					//这里最好使用函数，目的是将当前index传给函数使用。
					//否则，如果动画的定时器也写在这里，那么，当执行到这句时，还需要100毫秒才能执行动画的定时器中的代码
					//这样，在这100毫秒中，index就有可能被改。
					donghua(index);
					table[index].style.background = "#FFF";
				}
				
				var donghuaTimer = null;
				function donghua(num){
					//2、每次开启动画时，都停止前面的动画。
					//clearInterval(donghuaTimer);
					donghuaTimer = setInterval(function(){
						img[num].style.opacity = parseFloat(img[num].style.opacity) + 0.15;
						if(img[num].style.opacity>=1){
							clearInterval(donghuaTimer);
							flag = true;
						}
					},100);
				}
				
				function init(){
					for(var i=0;i<img.length;i++){
						img[i].style.opacity = 0;
						table[i].style.background = "#CCC";
					}
				};
			};