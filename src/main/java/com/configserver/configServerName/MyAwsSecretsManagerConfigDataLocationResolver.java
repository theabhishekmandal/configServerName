package com.configserver.configServerName;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.model.*;
import io.awspring.cloud.autoconfigure.secretsmanager.AwsSecretsManagerBootstrapConfiguration;
import io.awspring.cloud.autoconfigure.secretsmanager.AwsSecretsManagerConfigDataLocationResolver;
import io.awspring.cloud.secretsmanager.AwsSecretsManagerProperties;
import org.springframework.boot.BootstrapContext;
import org.springframework.stereotype.Service;

@Service
public class MyAwsSecretsManagerConfigDataLocationResolver extends AwsSecretsManagerConfigDataLocationResolver {

    protected AWSSecretsManager createAwsSecretsManagerClient(BootstrapContext context) {
        return get();
    }

    public AWSSecretsManager get() {
        return new AWSSecretsManager() {
            @Override
            public CancelRotateSecretResult cancelRotateSecret(CancelRotateSecretRequest cancelRotateSecretRequest) {
                return null;
            }

            @Override
            public CreateSecretResult createSecret(CreateSecretRequest createSecretRequest) {
                return null;
            }

            @Override
            public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {
                return null;
            }

            @Override
            public DeleteSecretResult deleteSecret(DeleteSecretRequest deleteSecretRequest) {
                return null;
            }

            @Override
            public DescribeSecretResult describeSecret(DescribeSecretRequest describeSecretRequest) {
                return null;
            }

            @Override
            public GetRandomPasswordResult getRandomPassword(GetRandomPasswordRequest getRandomPasswordRequest) {
                return null;
            }

            @Override
            public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest) {
                return null;
            }

            @Override
            public GetSecretValueResult getSecretValue(GetSecretValueRequest getSecretValueRequest) {
                return null;
            }

            @Override
            public ListSecretVersionIdsResult listSecretVersionIds(ListSecretVersionIdsRequest listSecretVersionIdsRequest) {
                return null;
            }

            @Override
            public ListSecretsResult listSecrets(ListSecretsRequest listSecretsRequest) {
                return null;
            }

            @Override
            public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest) {
                return null;
            }

            @Override
            public PutSecretValueResult putSecretValue(PutSecretValueRequest putSecretValueRequest) {
                return null;
            }

            @Override
            public RemoveRegionsFromReplicationResult removeRegionsFromReplication(RemoveRegionsFromReplicationRequest removeRegionsFromReplicationRequest) {
                return null;
            }

            @Override
            public ReplicateSecretToRegionsResult replicateSecretToRegions(ReplicateSecretToRegionsRequest replicateSecretToRegionsRequest) {
                return null;
            }

            @Override
            public RestoreSecretResult restoreSecret(RestoreSecretRequest restoreSecretRequest) {
                return null;
            }

            @Override
            public RotateSecretResult rotateSecret(RotateSecretRequest rotateSecretRequest) {
                return null;
            }

            @Override
            public StopReplicationToReplicaResult stopReplicationToReplica(StopReplicationToReplicaRequest stopReplicationToReplicaRequest) {
                return null;
            }

            @Override
            public TagResourceResult tagResource(TagResourceRequest tagResourceRequest) {
                return null;
            }

            @Override
            public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest) {
                return null;
            }

            @Override
            public UpdateSecretResult updateSecret(UpdateSecretRequest updateSecretRequest) {
                return null;
            }

            @Override
            public UpdateSecretVersionStageResult updateSecretVersionStage(UpdateSecretVersionStageRequest updateSecretVersionStageRequest) {
                return null;
            }

            @Override
            public ValidateResourcePolicyResult validateResourcePolicy(ValidateResourcePolicyRequest validateResourcePolicyRequest) {
                return null;
            }

            @Override
            public void shutdown() {

            }

            @Override
            public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
                return null;
            }
        };
    }
}
