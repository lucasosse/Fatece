
from SimpleCV import *

img = Image('image.png')
#pixel trapping on x, y coord.
pixel = img[20,20]
#get info on pixel
pxInfo = img.getPixel(20,20)
#get pixel height and width
print img.height
print img.width
#get RGB
(red,green,blue) = img.getPixel(20,20)
#change color
img[20,20] = (red, 0, 0)
img.show()
raw_input()
#resize
bigImg = img.resize(img.width*2, img.height*2)
bigImg.show()
raw_input()
#color distance -- this is making the image show up grey????
dist = img.colorDistance(img.getPixel(20,20))
dist.show()
raw_input()
#cropping: start at -(x,y)- then desired crop size area
cropImg = img.crop(20,20,100,100)
cropImg.show()
raw_input()
#threshold ??????
img = Image('image.png').toGray().binarize(128).invert()
img.show()
#img.write('editedImg.png')
#display
#img.show('editedImg.png')
raw_input()
