// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class EffigyChallengeDungeonResultInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_EffigyChallengeDungeonResultInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EffigyChallengeDungeonResultInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EffigyChallengeDungeonResultInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n&EffigyChallengeDungeonResultInfo.proto\"\u009c\u0001\n EffigyChallengeDungeonResultInfo\u0012\u0017\n\u000fchallenge_score\u0018\u0007 \u0001(\r\u0012\u0018\n\u0010is_in_time_limit\u0018\b \u0001(\b\u0012\u0014\n\fchallenge_id\u0018\u0006 \u0001(\r\u0012\u0012\n\nis_success\u0018\u000f \u0001(\b\u0012\u001b\n\u0013challenge_max_score\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EffigyChallengeDungeonResultInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EffigyChallengeDungeonResultInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor, new String[] { "ChallengeScore", "IsInTimeLimit", "ChallengeId", "IsSuccess", "ChallengeMaxScore" });
    }
    
    public static final class EffigyChallengeDungeonResultInfo extends GeneratedMessageV3 implements EffigyChallengeDungeonResultInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CHALLENGE_SCORE_FIELD_NUMBER = 7;
        private int challengeScore_;
        public static final int IS_IN_TIME_LIMIT_FIELD_NUMBER = 8;
        private boolean isInTimeLimit_;
        public static final int CHALLENGE_ID_FIELD_NUMBER = 6;
        private int challengeId_;
        public static final int IS_SUCCESS_FIELD_NUMBER = 15;
        private boolean isSuccess_;
        public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 13;
        private int challengeMaxScore_;
        private byte memoizedIsInitialized;
        private static final EffigyChallengeDungeonResultInfo DEFAULT_INSTANCE;
        private static final Parser<EffigyChallengeDungeonResultInfo> PARSER;
        
        private EffigyChallengeDungeonResultInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EffigyChallengeDungeonResultInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EffigyChallengeDungeonResultInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EffigyChallengeDungeonResultInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 48: {
                            this.challengeId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.challengeScore_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.isInTimeLimit_ = input.readBool();
                            continue;
                        }
                        case 104: {
                            this.challengeMaxScore_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EffigyChallengeDungeonResultInfo.class, Builder.class);
        }
        
        @Override
        public int getChallengeScore() {
            return this.challengeScore_;
        }
        
        @Override
        public boolean getIsInTimeLimit() {
            return this.isInTimeLimit_;
        }
        
        @Override
        public int getChallengeId() {
            return this.challengeId_;
        }
        
        @Override
        public boolean getIsSuccess() {
            return this.isSuccess_;
        }
        
        @Override
        public int getChallengeMaxScore() {
            return this.challengeMaxScore_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.challengeId_ != 0) {
                output.writeUInt32(6, this.challengeId_);
            }
            if (this.challengeScore_ != 0) {
                output.writeUInt32(7, this.challengeScore_);
            }
            if (this.isInTimeLimit_) {
                output.writeBool(8, this.isInTimeLimit_);
            }
            if (this.challengeMaxScore_ != 0) {
                output.writeUInt32(13, this.challengeMaxScore_);
            }
            if (this.isSuccess_) {
                output.writeBool(15, this.isSuccess_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.challengeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.challengeId_);
            }
            if (this.challengeScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.challengeScore_);
            }
            if (this.isInTimeLimit_) {
                size += CodedOutputStream.computeBoolSize(8, this.isInTimeLimit_);
            }
            if (this.challengeMaxScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.challengeMaxScore_);
            }
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(15, this.isSuccess_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EffigyChallengeDungeonResultInfo)) {
                return super.equals(obj);
            }
            final EffigyChallengeDungeonResultInfo other = (EffigyChallengeDungeonResultInfo)obj;
            return this.getChallengeScore() == other.getChallengeScore() && this.getIsInTimeLimit() == other.getIsInTimeLimit() && this.getChallengeId() == other.getChallengeId() && this.getIsSuccess() == other.getIsSuccess() && this.getChallengeMaxScore() == other.getChallengeMaxScore() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getChallengeScore();
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInTimeLimit());
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getChallengeId();
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getChallengeMaxScore();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EffigyChallengeDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EffigyChallengeDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EffigyChallengeDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EffigyChallengeDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EffigyChallengeDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EffigyChallengeDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EffigyChallengeDungeonResultInfo.PARSER, input);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EffigyChallengeDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static EffigyChallengeDungeonResultInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EffigyChallengeDungeonResultInfo.PARSER, input);
        }
        
        public static EffigyChallengeDungeonResultInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EffigyChallengeDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EffigyChallengeDungeonResultInfo.PARSER, input);
        }
        
        public static EffigyChallengeDungeonResultInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EffigyChallengeDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EffigyChallengeDungeonResultInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EffigyChallengeDungeonResultInfo prototype) {
            return EffigyChallengeDungeonResultInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EffigyChallengeDungeonResultInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EffigyChallengeDungeonResultInfo getDefaultInstance() {
            return EffigyChallengeDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<EffigyChallengeDungeonResultInfo> parser() {
            return EffigyChallengeDungeonResultInfo.PARSER;
        }
        
        @Override
        public Parser<EffigyChallengeDungeonResultInfo> getParserForType() {
            return EffigyChallengeDungeonResultInfo.PARSER;
        }
        
        @Override
        public EffigyChallengeDungeonResultInfo getDefaultInstanceForType() {
            return EffigyChallengeDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EffigyChallengeDungeonResultInfo();
            PARSER = new AbstractParser<EffigyChallengeDungeonResultInfo>() {
                @Override
                public EffigyChallengeDungeonResultInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EffigyChallengeDungeonResultInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EffigyChallengeDungeonResultInfoOrBuilder
        {
            private int challengeScore_;
            private boolean isInTimeLimit_;
            private int challengeId_;
            private boolean isSuccess_;
            private int challengeMaxScore_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EffigyChallengeDungeonResultInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EffigyChallengeDungeonResultInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.challengeScore_ = 0;
                this.isInTimeLimit_ = false;
                this.challengeId_ = 0;
                this.isSuccess_ = false;
                this.challengeMaxScore_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
            }
            
            @Override
            public EffigyChallengeDungeonResultInfo getDefaultInstanceForType() {
                return EffigyChallengeDungeonResultInfo.getDefaultInstance();
            }
            
            @Override
            public EffigyChallengeDungeonResultInfo build() {
                final EffigyChallengeDungeonResultInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EffigyChallengeDungeonResultInfo buildPartial() {
                final EffigyChallengeDungeonResultInfo result = new EffigyChallengeDungeonResultInfo(this);
                result.challengeScore_ = this.challengeScore_;
                result.isInTimeLimit_ = this.isInTimeLimit_;
                result.challengeId_ = this.challengeId_;
                result.isSuccess_ = this.isSuccess_;
                result.challengeMaxScore_ = this.challengeMaxScore_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof EffigyChallengeDungeonResultInfo) {
                    return this.mergeFrom((EffigyChallengeDungeonResultInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EffigyChallengeDungeonResultInfo other) {
                if (other == EffigyChallengeDungeonResultInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getChallengeScore() != 0) {
                    this.setChallengeScore(other.getChallengeScore());
                }
                if (other.getIsInTimeLimit()) {
                    this.setIsInTimeLimit(other.getIsInTimeLimit());
                }
                if (other.getChallengeId() != 0) {
                    this.setChallengeId(other.getChallengeId());
                }
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (other.getChallengeMaxScore() != 0) {
                    this.setChallengeMaxScore(other.getChallengeMaxScore());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                EffigyChallengeDungeonResultInfo parsedMessage = null;
                try {
                    parsedMessage = EffigyChallengeDungeonResultInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EffigyChallengeDungeonResultInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getChallengeScore() {
                return this.challengeScore_;
            }
            
            public Builder setChallengeScore(final int value) {
                this.challengeScore_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChallengeScore() {
                this.challengeScore_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsInTimeLimit() {
                return this.isInTimeLimit_;
            }
            
            public Builder setIsInTimeLimit(final boolean value) {
                this.isInTimeLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsInTimeLimit() {
                this.isInTimeLimit_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChallengeId() {
                return this.challengeId_;
            }
            
            public Builder setChallengeId(final int value) {
                this.challengeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChallengeId() {
                this.challengeId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsSuccess() {
                return this.isSuccess_;
            }
            
            public Builder setIsSuccess(final boolean value) {
                this.isSuccess_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSuccess() {
                this.isSuccess_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChallengeMaxScore() {
                return this.challengeMaxScore_;
            }
            
            public Builder setChallengeMaxScore(final int value) {
                this.challengeMaxScore_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChallengeMaxScore() {
                this.challengeMaxScore_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EffigyChallengeDungeonResultInfoOrBuilder extends MessageOrBuilder
    {
        int getChallengeScore();
        
        boolean getIsInTimeLimit();
        
        int getChallengeId();
        
        boolean getIsSuccess();
        
        int getChallengeMaxScore();
    }
}
