## Create a class named MediaFile.
Fields: \
size: a floating point number \
name: text \
date: last modification date

Methods: \
modifyDate: modifies the last modification date. set it to the current date.
modifyName: modify the name of the file.
abstract play: writes to the console: playing video/Showing picture: name of the media file.

None of the fields should be available from outside.
MediaFile class should not be instantiated.

## Create subclasses of MediaFile

### VideoFile 
Fields: \
videoFormat: enum, possible values(MP4,FLV,MKV)
containsSubtitles: true if contains subtitles
numberOfDubs: numbers
length: number
currentDub: text

Methods: \
play
switchDub: throws exception if only 1 dub is available (NoOtherDubException) \
equals and hashcode

The methods should come from an interface called: VideoService

### Picture
Fields: \
videoFormat: enum, possible values(JPEG,MPEG,PNG)\
isColorized: true is the picture is colorized
bitDepth: number

Methods: \
play
equals and hashCode

Fields should not reach from outside.\

## Directory
Should contain a MediaFile collection.
The collections should be only reachable within the class.
No getters and setters.

Methods: \
iterable: should return the iterator of the list.
captureVideo: parameters are the parameters needed for a video.
capturePicture: parameters are then parameters needed for a picture
