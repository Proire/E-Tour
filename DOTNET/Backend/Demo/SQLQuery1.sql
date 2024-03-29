CREATE TABLE [dbo].[Passes] (
    [PassengerId]     INT            IDENTITY (1, 1) NOT NULL,
    [PassengerName]   NVARCHAR (MAX) NULL,
    [BirthDate]       NVARCHAR (MAX) NULL,
    [PassengerType]   NVARCHAR (MAX) NULL,
    [PassengerAmount] INT            NOT NULL,
    [custId]       INT            NOT NULL,
    CONSTRAINT [PK_Passes] PRIMARY KEY CLUSTERED ([PassengerId] ASC),
);




