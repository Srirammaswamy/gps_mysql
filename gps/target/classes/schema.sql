DROP TABLE IF EXISTS data;
CREATE table data (
	user_id INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
	username VARCHAR(20) UNIQUE NOT NULL,
	password VARCHAR(20) NOT NULL,
	date DATE,
	time TIME,
	latitude DOUBLE DEFAULT '0.0',
	longitude DOUBLE DEFAULT '0.0',
	speed FLOAT DEFAULT '0.0'
	
);