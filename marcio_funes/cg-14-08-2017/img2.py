from SimpleCV import *

img = Image('image.png')
#color distance -- this is making the image show up grey????
dist = img.colorDistance(img.getPixel(77,77))
dist.show()
raw_input()
