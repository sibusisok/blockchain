/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Block;
import io.swagger.client.model.BlockList;
import io.swagger.client.model.Connection;
import io.swagger.client.model.ConnectionList;
import io.swagger.client.model.Transaction;
import io.swagger.client.model.TransactionList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectionsApi
 */
@Ignore
public class ConnectionsApiTest {

    private final ConnectionsApi api = new ConnectionsApi();

    
    /**
     * 
     *
     * Gets the block matching a specific block ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blockGetTest() throws ApiException {
        Integer connectionId = null;
        Integer blockId = null;
        Block response = api.blockGet(connectionId, blockId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lists the blocks for a connected blockchain network.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void blocksGetTest() throws ApiException {
        Integer connectionID = null;
        Integer top = null;
        Integer skip = null;
        BlockList response = api.blocksGet(connectionID, top, skip);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the connected blockchain network matching a specific chain instance ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionGetTest() throws ApiException {
        Integer connectionID = null;
        Connection response = api.connectionGet(connectionID);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lists the connected blockchain networks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsGetTest() throws ApiException {
        Integer top = null;
        Integer skip = null;
        ConnectionList response = api.connectionsGet(top, skip);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the transaction matching a specific transaction ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionGetTest() throws ApiException {
        Integer connectionId = null;
        Integer transactionId = null;
        Transaction response = api.transactionGet(connectionId, transactionId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lists the transactions for a connected blockchain network.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionsGetTest() throws ApiException {
        Integer connectionId = null;
        Integer top = null;
        Integer skip = null;
        List<TransactionList> response = api.transactionsGet(connectionId, top, skip);

        // TODO: test validations
    }
    
}
