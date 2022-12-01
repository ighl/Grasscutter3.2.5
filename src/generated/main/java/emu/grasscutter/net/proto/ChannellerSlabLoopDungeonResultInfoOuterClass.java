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

public final class ChannellerSlabLoopDungeonResultInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ChannellerSlabLoopDungeonResultInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ChannellerSlabLoopDungeonResultInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n)ChannellerSlabLoopDungeonResultInfo.proto\" \u0001\n#ChannellerSlabLoopDungeonResultInfo\u0012\u0015\n\rdungeon_index\u0018\u0001 \u0001(\r\u0012\u0012\n\nis_success\u0018\u0002 \u0001(\b\u0012\u0017\n\u000fchallenge_score\u0018\u0003 \u0001(\r\u0012\u001b\n\u0013challenge_max_score\u0018\u0004 \u0001(\r\u0012\u0018\n\u0010is_in_time_limit\u0018\u0005 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ChannellerSlabLoopDungeonResultInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor, new String[] { "DungeonIndex", "IsSuccess", "ChallengeScore", "ChallengeMaxScore", "IsInTimeLimit" });
    }
    
    public static final class ChannellerSlabLoopDungeonResultInfo extends GeneratedMessageV3 implements ChannellerSlabLoopDungeonResultInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DUNGEON_INDEX_FIELD_NUMBER = 1;
        private int dungeonIndex_;
        public static final int IS_SUCCESS_FIELD_NUMBER = 2;
        private boolean isSuccess_;
        public static final int CHALLENGE_SCORE_FIELD_NUMBER = 3;
        private int challengeScore_;
        public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 4;
        private int challengeMaxScore_;
        public static final int IS_IN_TIME_LIMIT_FIELD_NUMBER = 5;
        private boolean isInTimeLimit_;
        private byte memoizedIsInitialized;
        private static final ChannellerSlabLoopDungeonResultInfo DEFAULT_INSTANCE;
        private static final Parser<ChannellerSlabLoopDungeonResultInfo> PARSER;
        
        private ChannellerSlabLoopDungeonResultInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ChannellerSlabLoopDungeonResultInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ChannellerSlabLoopDungeonResultInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ChannellerSlabLoopDungeonResultInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.dungeonIndex_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        case 24: {
                            this.challengeScore_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.challengeMaxScore_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.isInTimeLimit_ = input.readBool();
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
            return ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ChannellerSlabLoopDungeonResultInfo.class, Builder.class);
        }
        
        @Override
        public int getDungeonIndex() {
            return this.dungeonIndex_;
        }
        
        @Override
        public boolean getIsSuccess() {
            return this.isSuccess_;
        }
        
        @Override
        public int getChallengeScore() {
            return this.challengeScore_;
        }
        
        @Override
        public int getChallengeMaxScore() {
            return this.challengeMaxScore_;
        }
        
        @Override
        public boolean getIsInTimeLimit() {
            return this.isInTimeLimit_;
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
            if (this.dungeonIndex_ != 0) {
                output.writeUInt32(1, this.dungeonIndex_);
            }
            if (this.isSuccess_) {
                output.writeBool(2, this.isSuccess_);
            }
            if (this.challengeScore_ != 0) {
                output.writeUInt32(3, this.challengeScore_);
            }
            if (this.challengeMaxScore_ != 0) {
                output.writeUInt32(4, this.challengeMaxScore_);
            }
            if (this.isInTimeLimit_) {
                output.writeBool(5, this.isInTimeLimit_);
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
            if (this.dungeonIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.dungeonIndex_);
            }
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(2, this.isSuccess_);
            }
            if (this.challengeScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.challengeScore_);
            }
            if (this.challengeMaxScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.challengeMaxScore_);
            }
            if (this.isInTimeLimit_) {
                size += CodedOutputStream.computeBoolSize(5, this.isInTimeLimit_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChannellerSlabLoopDungeonResultInfo)) {
                return super.equals(obj);
            }
            final ChannellerSlabLoopDungeonResultInfo other = (ChannellerSlabLoopDungeonResultInfo)obj;
            return this.getDungeonIndex() == other.getDungeonIndex() && this.getIsSuccess() == other.getIsSuccess() && this.getChallengeScore() == other.getChallengeScore() && this.getChallengeMaxScore() == other.getChallengeMaxScore() && this.getIsInTimeLimit() == other.getIsInTimeLimit() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getDungeonIndex();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getChallengeScore();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getChallengeMaxScore();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInTimeLimit());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ChannellerSlabLoopDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChannellerSlabLoopDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ChannellerSlabLoopDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChannellerSlabLoopDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ChannellerSlabLoopDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChannellerSlabLoopDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChannellerSlabLoopDungeonResultInfo.PARSER, input);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChannellerSlabLoopDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChannellerSlabLoopDungeonResultInfo.PARSER, input);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChannellerSlabLoopDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChannellerSlabLoopDungeonResultInfo.PARSER, input);
        }
        
        public static ChannellerSlabLoopDungeonResultInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChannellerSlabLoopDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ChannellerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ChannellerSlabLoopDungeonResultInfo prototype) {
            return ChannellerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ChannellerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ChannellerSlabLoopDungeonResultInfo getDefaultInstance() {
            return ChannellerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ChannellerSlabLoopDungeonResultInfo> parser() {
            return ChannellerSlabLoopDungeonResultInfo.PARSER;
        }
        
        @Override
        public Parser<ChannellerSlabLoopDungeonResultInfo> getParserForType() {
            return ChannellerSlabLoopDungeonResultInfo.PARSER;
        }
        
        @Override
        public ChannellerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
            return ChannellerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ChannellerSlabLoopDungeonResultInfo();
            PARSER = new AbstractParser<ChannellerSlabLoopDungeonResultInfo>() {
                @Override
                public ChannellerSlabLoopDungeonResultInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ChannellerSlabLoopDungeonResultInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChannellerSlabLoopDungeonResultInfoOrBuilder
        {
            private int dungeonIndex_;
            private boolean isSuccess_;
            private int challengeScore_;
            private int challengeMaxScore_;
            private boolean isInTimeLimit_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ChannellerSlabLoopDungeonResultInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ChannellerSlabLoopDungeonResultInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.dungeonIndex_ = 0;
                this.isSuccess_ = false;
                this.challengeScore_ = 0;
                this.challengeMaxScore_ = 0;
                this.isInTimeLimit_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
            }
            
            @Override
            public ChannellerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
                return ChannellerSlabLoopDungeonResultInfo.getDefaultInstance();
            }
            
            @Override
            public ChannellerSlabLoopDungeonResultInfo build() {
                final ChannellerSlabLoopDungeonResultInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ChannellerSlabLoopDungeonResultInfo buildPartial() {
                final ChannellerSlabLoopDungeonResultInfo result = new ChannellerSlabLoopDungeonResultInfo(this);
                result.dungeonIndex_ = this.dungeonIndex_;
                result.isSuccess_ = this.isSuccess_;
                result.challengeScore_ = this.challengeScore_;
                result.challengeMaxScore_ = this.challengeMaxScore_;
                result.isInTimeLimit_ = this.isInTimeLimit_;
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
                if (other instanceof ChannellerSlabLoopDungeonResultInfo) {
                    return this.mergeFrom((ChannellerSlabLoopDungeonResultInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ChannellerSlabLoopDungeonResultInfo other) {
                if (other == ChannellerSlabLoopDungeonResultInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getDungeonIndex() != 0) {
                    this.setDungeonIndex(other.getDungeonIndex());
                }
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (other.getChallengeScore() != 0) {
                    this.setChallengeScore(other.getChallengeScore());
                }
                if (other.getChallengeMaxScore() != 0) {
                    this.setChallengeMaxScore(other.getChallengeMaxScore());
                }
                if (other.getIsInTimeLimit()) {
                    this.setIsInTimeLimit(other.getIsInTimeLimit());
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
                ChannellerSlabLoopDungeonResultInfo parsedMessage = null;
                try {
                    parsedMessage = ChannellerSlabLoopDungeonResultInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ChannellerSlabLoopDungeonResultInfo)e.getUnfinishedMessage();
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
            public int getDungeonIndex() {
                return this.dungeonIndex_;
            }
            
            public Builder setDungeonIndex(final int value) {
                this.dungeonIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDungeonIndex() {
                this.dungeonIndex_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface ChannellerSlabLoopDungeonResultInfoOrBuilder extends MessageOrBuilder
    {
        int getDungeonIndex();
        
        boolean getIsSuccess();
        
        int getChallengeScore();
        
        int getChallengeMaxScore();
        
        boolean getIsInTimeLimit();
    }
}
