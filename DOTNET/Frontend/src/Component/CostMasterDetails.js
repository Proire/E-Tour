import React, { useState, useEffect } from 'react';
import { useNavigate,useParams } from 'react-router-dom';
import { Card, Button } from 'react-bootstrap';
import './CostMasterDetails.css';

function CostMasterDetails() {
    const { catMasterId } = useParams();
    const departDate = sessionStorage.getItem("departdate");

    let navigate = useNavigate();
    const [costMaster, setCostMaster] = useState({});
    //const [dateMaster, setDateMaster] = useState([]);
    console.log(departDate);
    useEffect(() => {
        console.log(departDate);
        fetch("https://localhost:7003/cost/bydate/"+departDate)
            .then(res => res.json())
            .then(data => {
                setCostMaster(data);
                console.log(data);
            })
            .catch(error => {
                console.error('Error fetching cost master details:', error);
            });
    }, []);

    // useEffect(() => {
    //     fetch("http://localhost:8081/api/date_master/ById/"+ pkgId)
    //         .then(res => res.json())
    //         .then(data => {
    //             setDateMaster(data);
    //         })
    //         .catch(error => {
    //             console.error('Error fetching cost master details:', error);
    //         });
    // }, []);
    // Assuming you want to display the details of the first costMaster item
    //const item2 = dateMaster[0];
    return (
        <div className="cost-master-container">
            <h1 className="centered-heading">Cost Details</h1>
            <div className="card-container">
                <Card className="cost-card">
                    <Card.Body>
                        {/* <Card.Title className="card-title">Cost ID: {item?.costId}</Card.Title> */}
                        <div className="table-container">
                            <table className="table">
                                <tbody>
                                    <tr>
                                        <th>Field</th>
                                        <th>Value</th>
                                    </tr>
                                    <tr>
                                        <td>Cost</td>
                                        <td>Rs.{costMaster.cost1}</td>
                                    </tr>
                                    <tr>
                                        <td>Single Person Cost</td>
                                        <td>Rs.{costMaster.singlePersonCost}</td>
                                    </tr>
                                    <tr>
                                        <td>Extra Person Cost</td>
                                        <td>Rs.{costMaster.extraPersonCost}</td>
                                    </tr>
                                    <tr>
                                        <td>Child With Bed</td>
                                        <td>Rs.{costMaster.childWithBed}</td>
                                    </tr>
                                    <tr>
                                        <td>Child Without Bed</td>
                                        <td>Rs.{costMaster.childWithoutBed}</td>
                                    </tr>
                                    {/* <tr>
                                        <td>Valid From</td>
                                        <td>{item?.validFrom}</td>
                                    </tr>
                                    <tr>
                                        <td>Valid To</td>
                                        <td>{item?.validTo}</td>
                                    </tr> */}
                                </tbody>
                            </table>
                        </div>
                          <Button variant="primary" onClick={() => navigate(`/bypkgMasterId/${sessionStorage.getItem("catid")}`)}> 
                            Go to Itinerary Detail
                        </Button> 
                    </Card.Body>
                </Card>
            </div>
        </div>
    );
}

export default CostMasterDetails;