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

public final class ChannelerSlabLoopDungeonResultInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ChannelerSlabLoopDungeonResultInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ChannelerSlabLoopDungeonResultInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ChannelerSlabLoopDungeonResultInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n(ChannelerSlabLoopDungeonResultInfo.proto\"\u009f\u0001\n\"ChannelerSlabLoopDungeonResultInfo\u0012\u0012\n\nis_success\u0018\u000b \u0001(\b\u0012\u001b\n\u0013challenge_max_score\u0018\b \u0001(\r\u0012\u0015\n\rdungeon_index\u0018\u0007 \u0001(\r\u0012\u0018\n\u0010is_in_time_limit\u0018\n \u0001(\b\u0012\u0017\n\u000fchallenge_score\u0018\f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ChannelerSlabLoopDungeonResultInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ChannelerSlabLoopDungeonResultInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor, new String[] { "IsSuccess", "ChallengeMaxScore", "DungeonIndex", "IsInTimeLimit", "ChallengeScore" });
    }
    
    public static final class ChannelerSlabLoopDungeonResultInfo extends GeneratedMessageV3 implements ChannelerSlabLoopDungeonResultInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_SUCCESS_FIELD_NUMBER = 11;
        private boolean isSuccess_;
        public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 8;
        private int challengeMaxScore_;
        public static final int DUNGEON_INDEX_FIELD_NUMBER = 7;
        private int dungeonIndex_;
        public static final int IS_IN_TIME_LIMIT_FIELD_NUMBER = 10;
        private boolean isInTimeLimit_;
        public static final int CHALLENGE_SCORE_FIELD_NUMBER = 12;
        private int challengeScore_;
        private byte memoizedIsInitialized;
        private static final ChannelerSlabLoopDungeonResultInfo DEFAULT_INSTANCE;
        private static final Parser<ChannelerSlabLoopDungeonResultInfo> PARSER;
        
        private ChannelerSlabLoopDungeonResultInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ChannelerSlabLoopDungeonResultInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ChannelerSlabLoopDungeonResultInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ChannelerSlabLoopDungeonResultInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 56: {
                            this.dungeonIndex_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.challengeMaxScore_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.isInTimeLimit_ = input.readBool();
                            continue;
                        }
                        case 88: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        case 96: {
                            this.challengeScore_ = input.readUInt32();
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
            return ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ChannelerSlabLoopDungeonResultInfo.class, Builder.class);
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
        public int getDungeonIndex() {
            return this.dungeonIndex_;
        }
        
        @Override
        public boolean getIsInTimeLimit() {
            return this.isInTimeLimit_;
        }
        
        @Override
        public int getChallengeScore() {
            return this.challengeScore_;
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
                output.writeUInt32(7, this.dungeonIndex_);
            }
            if (this.challengeMaxScore_ != 0) {
                output.writeUInt32(8, this.challengeMaxScore_);
            }
            if (this.isInTimeLimit_) {
                output.writeBool(10, this.isInTimeLimit_);
            }
            if (this.isSuccess_) {
                output.writeBool(11, this.isSuccess_);
            }
            if (this.challengeScore_ != 0) {
                output.writeUInt32(12, this.challengeScore_);
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
                size += CodedOutputStream.computeUInt32Size(7, this.dungeonIndex_);
            }
            if (this.challengeMaxScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.challengeMaxScore_);
            }
            if (this.isInTimeLimit_) {
                size += CodedOutputStream.computeBoolSize(10, this.isInTimeLimit_);
            }
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(11, this.isSuccess_);
            }
            if (this.challengeScore_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.challengeScore_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChannelerSlabLoopDungeonResultInfo)) {
                return super.equals(obj);
            }
            final ChannelerSlabLoopDungeonResultInfo other = (ChannelerSlabLoopDungeonResultInfo)obj;
            return this.getIsSuccess() == other.getIsSuccess() && this.getChallengeMaxScore() == other.getChallengeMaxScore() && this.getDungeonIndex() == other.getDungeonIndex() && this.getIsInTimeLimit() == other.getIsInTimeLimit() && this.getChallengeScore() == other.getChallengeScore() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getChallengeMaxScore();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getDungeonIndex();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInTimeLimit());
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getChallengeScore();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ChannelerSlabLoopDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChannelerSlabLoopDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ChannelerSlabLoopDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChannelerSlabLoopDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ChannelerSlabLoopDungeonResultInfo.PARSER.parseFrom(data);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChannelerSlabLoopDungeonResultInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChannelerSlabLoopDungeonResultInfo.PARSER, input);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChannelerSlabLoopDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChannelerSlabLoopDungeonResultInfo.PARSER, input);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChannelerSlabLoopDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChannelerSlabLoopDungeonResultInfo.PARSER, input);
        }
        
        public static ChannelerSlabLoopDungeonResultInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChannelerSlabLoopDungeonResultInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ChannelerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ChannelerSlabLoopDungeonResultInfo prototype) {
            return ChannelerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ChannelerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ChannelerSlabLoopDungeonResultInfo getDefaultInstance() {
            return ChannelerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ChannelerSlabLoopDungeonResultInfo> parser() {
            return ChannelerSlabLoopDungeonResultInfo.PARSER;
        }
        
        @Override
        public Parser<ChannelerSlabLoopDungeonResultInfo> getParserForType() {
            return ChannelerSlabLoopDungeonResultInfo.PARSER;
        }
        
        @Override
        public ChannelerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
            return ChannelerSlabLoopDungeonResultInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ChannelerSlabLoopDungeonResultInfo();
            PARSER = new AbstractParser<ChannelerSlabLoopDungeonResultInfo>() {
                @Override
                public ChannelerSlabLoopDungeonResultInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ChannelerSlabLoopDungeonResultInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChannelerSlabLoopDungeonResultInfoOrBuilder
        {
            private boolean isSuccess_;
            private int challengeMaxScore_;
            private int dungeonIndex_;
            private boolean isInTimeLimit_;
            private int challengeScore_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ChannelerSlabLoopDungeonResultInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ChannelerSlabLoopDungeonResultInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isSuccess_ = false;
                this.challengeMaxScore_ = 0;
                this.dungeonIndex_ = 0;
                this.isInTimeLimit_ = false;
                this.challengeScore_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor;
            }
            
            @Override
            public ChannelerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
                return ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
            }
            
            @Override
            public ChannelerSlabLoopDungeonResultInfo build() {
                final ChannelerSlabLoopDungeonResultInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ChannelerSlabLoopDungeonResultInfo buildPartial() {
                final ChannelerSlabLoopDungeonResultInfo result = new ChannelerSlabLoopDungeonResultInfo(this);
                result.isSuccess_ = this.isSuccess_;
                result.challengeMaxScore_ = this.challengeMaxScore_;
                result.dungeonIndex_ = this.dungeonIndex_;
                result.isInTimeLimit_ = this.isInTimeLimit_;
                result.challengeScore_ = this.challengeScore_;
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
                if (other instanceof ChannelerSlabLoopDungeonResultInfo) {
                    return this.mergeFrom((ChannelerSlabLoopDungeonResultInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ChannelerSlabLoopDungeonResultInfo other) {
                if (other == ChannelerSlabLoopDungeonResultInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (other.getChallengeMaxScore() != 0) {
                    this.setChallengeMaxScore(other.getChallengeMaxScore());
                }
                if (other.getDungeonIndex() != 0) {
                    this.setDungeonIndex(other.getDungeonIndex());
                }
                if (other.getIsInTimeLimit()) {
                    this.setIsInTimeLimit(other.getIsInTimeLimit());
                }
                if (other.getChallengeScore() != 0) {
                    this.setChallengeScore(other.getChallengeScore());
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
                ChannelerSlabLoopDungeonResultInfo parsedMessage = null;
                try {
                    parsedMessage = ChannelerSlabLoopDungeonResultInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ChannelerSlabLoopDungeonResultInfo)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface ChannelerSlabLoopDungeonResultInfoOrBuilder extends MessageOrBuilder
    {
        boolean getIsSuccess();
        
        int getChallengeMaxScore();
        
        int getDungeonIndex();
        
        boolean getIsInTimeLimit();
        
        int getChallengeScore();
    }
}
