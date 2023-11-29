SELECT 
        room.id,
        room.name,
        movie.name,
       	showtime.starttime,
        count(ticket.id) || '/110' as total,
        movie.status
FROM room left join showtime on showtime.roomid = room.id
		left join ticket on ticket.showtimeid = showtime.id
		left join languageofmovie on languageofmovie.id  = showtime.languageofmovieid 
		left join movie on movie.id = languageofmovie.movieid 
WHERE branchid = /* id */'cn1' and to_char(showtime.showdate,'dd/MM/yyyy') = /* showdate */'31/08/2023'
group by room.id,
        room.name,
        movie.name,
        showtime.starttime,
        movie.status