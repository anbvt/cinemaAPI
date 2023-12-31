SELECT movie.id, movie.name, yearofmanufacture,
	   poster, time, describe,
	   trailer, status, limitage,
	   country.name AS country,
	   STRING_AGG(DISTINCT typeofmovie.id, ',') AS movie_types_id,
       STRING_AGG(DISTINCT typeofmovie.name, ', ') AS movie_types,
       STRING_AGG(DISTINCT actor.name, ', ') AS actors,
	   STRING_AGG(DISTINCT director.name, ', ') AS directors,
	   STRING_AGG(DISTINCT language.name, ', ') AS languages,
	   (SELECT AVG(test.rate) FROM BILL JOIN (SELECT bill.id, bill.rate AS rate FROM movie LEFT JOIN languageofmovie ON languageofmovie.movieid = movie.id LEFT JOIN showtime ON languageofmovie.id = showtime.languageofmovieid LEFT JOIN ticket ON showtime.id = ticket.showtimeid LEFT JOIN bill ON ticket.billid = bill.id WHERE movie.id = /* movieid */'MP01' AND bill.rate is not null AND bill.rate != 0 GROUP BY bill.id) AS TEST ON TEST.id = bill.id) AS rate
FROM movie
LEFT JOIN moviedetails ON movie.id = moviedetails.movieid
LEFT JOIN typeofmovie ON moviedetails.typeofmovieid = typeofmovie.id
LEFT JOIN actorofmovie ON movie.id = actorofmovie.movieid
LEFT JOIN actor ON actor.id = actorofmovie.actorid
LEFT JOIN languageofmovie ON languageofmovie.movieid = movie.id
LEFT JOIN language ON language.id = languageofmovie.languageid
LEFT JOIN directorofmovie ON directorofmovie.movieid = movie.id
LEFT JOIN director ON director.id = directorofmovie.directorid
LEFT JOIN country ON country.id = movie.countryid
LEFT JOIN showtime ON languageofmovie.id = showtime.languageofmovieid
LEFT JOIN ticket ON showtime.id = ticket.showtimeid
LEFT JOIN bill ON ticket.billid = bill.id

WHERE movie.id = /* movieid */'MP01'
GROUP BY movie.id,
		 movie.name,
		 yearofmanufacture,
		 time,
         poster,
		 describe,
		 trailer,
         status,
		 limitage,
		 country;
