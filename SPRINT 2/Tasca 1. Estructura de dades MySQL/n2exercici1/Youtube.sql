DROP DATABASE IF EXISTS Youtube;
CREATE DATABASE Youtube;
USE Youtube;

CREATE TABLE Users (
	IDUser INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(50) NOT NULL UNIQUE,
    Password VARCHAR(20) NOT NULL,
    Username VARCHAR(20) NOT NULL,
    BirthDate DATE NOT NULL,
    Gender ENUM("M", "F", "NB", "A", "T", "Others", "NS") NOT NULL,
    Country VARCHAR(20) NOT NULL,
    PostalCode INT NOT NULL
);
CREATE TABLE Videos (
	IDVideo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    IDUser INT NOT NULL,
    Title VARCHAR(50) NOT NULL,
    Description VARCHAR(500) NOT NULL,
    Size FLOAT NOT NULL,
    VideoFileName VARCHAR(20) NOT NULL,
    Duration TIME NOT NULL,
    Thumbnail VARCHAR(300) NOT NULL,
    Views INT NOT NULL,
    Likes INT NOT NULL,
    Dislikes INT NOT NULL,
    Visibility ENUM("Public", "Hidden", "Private"),
    PublishDateTime DATETIME NOT NULL,
    FOREIGN KEY (IDUser) REFERENCES Users(IDUser)
);
CREATE TABLE Tags (
	TagID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(30) NOT NULL
);
CREATE TABLE VideoTags (
	TagID INT NOT NULL,
    IDVideo INT NOT NULL,
    FOREIGN KEY (TagID) REFERENCES Tags(TagID),
    FOREIGN KEY (IDVideo) REFERENCES Videos(IDVideo)
);
CREATE TABLE Playlists (
	PlaylistID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    IDUser INT NOT NULL,
    Name VARCHAR(30) NOT NULL,
    CreationDate DATE NOT NULL,
    Visibility ENUM("Public", "Private") NOT NULL,
    FOREIGN KEY (IDUser) REFERENCES Users(IDUser)
);
CREATE TABLE Channels (
	ChannelID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    IDUser INT NOT NULL,
    Name VARCHAR(30) NOT NULL,
    Description VARCHAR(300) NOT NULL,
    CreationDate DATE NOT NULL,
    FOREIGN KEY (IDUser) REFERENCES Users(IDUser)
);
CREATE TABLE VideoChannels (
	ChannelID INT NOT NULL,
    IDVideo INT NOT NULL,
    FOREIGN KEY (ChannelID) REFERENCES Channels(ChannelID),
    FOREIGN KEY (IDVideo) REFERENCES Videos(IDVideo)
);
CREATE TABLE ChannelSubscriptions (
	ChannelID INT NOT NULL,
    IDUser INT NOT NULL,
    FOREIGN KEY (ChannelID) REFERENCES Channels(ChannelID),
    FOREIGN KEY (IDUser) REFERENCES Users(IDUser)
);
CREATE TABLE VideoComments (
	CommentID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    IDVideo INT NOT NULL,
    IDUser INT NOT NULL,
    CommentText VARCHAR(300) NOT NULL,
    DateTime DATETIME NOT NULL,
    FOREIGN KEY (IDVideo) REFERENCES Videos(IDVideo),
    FOREIGN KEY (IDUser) REFERENCES Users(IDUser)
);
CREATE TABLE VideoLikesDislikes (
	IDVideo INT NOT NULL,
    IDUser INT NOT NULL,
    Type ENUM("Like", "Dislike") NOT NULL,
    DateTime DATETIME NOT NULL,
    FOREIGN KEY (IDVideo) REFERENCES Videos(IDVideo),
    FOREIGN KEY (IDUser) REFERENCES Users(IDUser),
    UNIQUE KEY (IDVideo, IDUser)
);
CREATE TABLE CommentLikesDislikes (
	CommentID INT NOT NULL,
    IDUser INT NOT NULL,
    Type ENUM("Like", "Dislike") NOT NULL,
    DateTime DATETIME NOT NULL,
    FOREIGN KEY (CommentID) REFERENCES VideoComments(CommentID),
    FOREIGN KEY (IDUser) REFERENCES Users(IDUser),
    UNIQUE KEY (CommentID, IDUser)
);
