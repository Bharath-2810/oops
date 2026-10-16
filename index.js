// server.js

const express = require("express");
const app = express();
const router = express.Router();

const PORT = 1444;

router.get("/", (req, res) => {
    res.send("Welcome to the Train Ticket Booking Portal");
});

router.get("/trains", (req, res) => {
    res.send("Available Trains: Chennai Express, Coimbatore Express, Kerala Express");
});

router.get("/tickets", (req, res) => {
    res.send("Train Ticket Booking: Select your train and preferred seat");
});

router.get("/station", (req, res) => {
    res.send("Station: Chennai Central, Platform 3");
});

router.get("/offers", (req, res) => {
    res.send("Special Offer: Get 20% off on weekend train bookings");
});

router.get("/booking", (req, res) => {
    res.send("Booking Status: Your train ticket is confirmed");
});

app.use("/", router);

app.listen(PORT, () => {
    console.log(`Train Booking Portal running at http://localhost:${PORT}`);
});