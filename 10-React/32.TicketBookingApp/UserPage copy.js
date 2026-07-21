import React from "react";
function UserPage() {
    return (
        <div>
            <h2>Welcome User</h2>
            <h3>Available Flights</h3>
            <table border="1" cellPadding="8">
                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Fare</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>AI101</td>
                        <td>Chennai</td>
                        <td>Delhi</td>
                        <td>₹6500</td>
                    </tr>
                    <tr>
                        <td>AI202</td>
                        <td>Bangalore</td>
                        <td>Mumbai</td>
                        <td>₹5500</td>
                    </tr>
                </tbody>
            </table>
            <button>Book Ticket</button>
        </div>
    );
}
export default UserPage;