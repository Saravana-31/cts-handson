import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Abishek Sharma", score: 90 },
        { name: "Rohit Sharma", score: 68 },
        { name: "Virat", score: 95 },
        { name: "Ishan Kishan", score: 60 },
        { name: "NKR", score: 72 },
        { name: "Rahul", score: 65 },
        { name: "Pant", score: 88 },
        { name: "Hardik", score: 55 },
        { name: "Jadeja", score: 78 },
        { name: "Shami", score: 45 },
        { name: "Bumrah", score: 82 }
    ];

    const below70 = players.filter(player => player.score < 70);
    return (
        <div>
            <h2>List of Players</h2>
            <table border="1" cellPadding="8">
                <thead>
                    <tr>
                        <th>Player</th>
                        <th>Score</th>
                    </tr>
                </thead>
                <tbody>
                    {players.map((player, index) => (
                        <tr key={index}>
                            <td>{player.name}</td>
                            <td>{player.score}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
            <br />
            <h2>Players with Score Below 70</h2>
            <ul>
                {below70.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListofPlayers;