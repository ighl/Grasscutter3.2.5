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

public final class Unk2700FDEGJOCDDGH
{
    private static final Descriptors.Descriptor internal_static_Unk2700_FDEGJOCDDGH_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2700_FDEGJOCDDGH_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2700FDEGJOCDDGH() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2700FDEGJOCDDGH.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2700_FDEGJOCDDGH.proto\"n\n\u0013Unk2700_FDEGJOCDDGH\u0012\u0014\n\fcur_progress\u0018\t \u0001(\r\u0012\u0017\n\u000fchallenge_index\u0018\n \u0001(\r\u0012\u0012\n\nis_success\u0018\u0004 \u0001(\b\u0012\u0014\n\fchallenge_id\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2700FDEGJOCDDGH.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Unk2700_FDEGJOCDDGH_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2700_FDEGJOCDDGH_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_descriptor, new String[] { "CurProgress", "ChallengeIndex", "IsSuccess", "ChallengeId" });
    }
    
    public static final class Unk2700_FDEGJOCDDGH extends GeneratedMessageV3 implements Unk2700_FDEGJOCDDGHOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUR_PROGRESS_FIELD_NUMBER = 9;
        private int curProgress_;
        public static final int CHALLENGE_INDEX_FIELD_NUMBER = 10;
        private int challengeIndex_;
        public static final int IS_SUCCESS_FIELD_NUMBER = 4;
        private boolean isSuccess_;
        public static final int CHALLENGE_ID_FIELD_NUMBER = 8;
        private int challengeId_;
        private byte memoizedIsInitialized;
        private static final Unk2700_FDEGJOCDDGH DEFAULT_INSTANCE;
        private static final Parser<Unk2700_FDEGJOCDDGH> PARSER;
        
        private Unk2700_FDEGJOCDDGH(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2700_FDEGJOCDDGH() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2700_FDEGJOCDDGH();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2700_FDEGJOCDDGH(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        case 64: {
                            this.challengeId_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.curProgress_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.challengeIndex_ = input.readUInt32();
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
            return Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_FDEGJOCDDGH.class, Builder.class);
        }
        
        @Override
        public int getCurProgress() {
            return this.curProgress_;
        }
        
        @Override
        public int getChallengeIndex() {
            return this.challengeIndex_;
        }
        
        @Override
        public boolean getIsSuccess() {
            return this.isSuccess_;
        }
        
        @Override
        public int getChallengeId() {
            return this.challengeId_;
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
            if (this.isSuccess_) {
                output.writeBool(4, this.isSuccess_);
            }
            if (this.challengeId_ != 0) {
                output.writeUInt32(8, this.challengeId_);
            }
            if (this.curProgress_ != 0) {
                output.writeUInt32(9, this.curProgress_);
            }
            if (this.challengeIndex_ != 0) {
                output.writeUInt32(10, this.challengeIndex_);
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
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(4, this.isSuccess_);
            }
            if (this.challengeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.challengeId_);
            }
            if (this.curProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.curProgress_);
            }
            if (this.challengeIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.challengeIndex_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2700_FDEGJOCDDGH)) {
                return super.equals(obj);
            }
            final Unk2700_FDEGJOCDDGH other = (Unk2700_FDEGJOCDDGH)obj;
            return this.getCurProgress() == other.getCurProgress() && this.getChallengeIndex() == other.getChallengeIndex() && this.getIsSuccess() == other.getIsSuccess() && this.getChallengeId() == other.getChallengeId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCurProgress();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getChallengeIndex();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getChallengeId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2700_FDEGJOCDDGH.PARSER.parseFrom(data);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_FDEGJOCDDGH.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2700_FDEGJOCDDGH.PARSER.parseFrom(data);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_FDEGJOCDDGH.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2700_FDEGJOCDDGH.PARSER.parseFrom(data);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_FDEGJOCDDGH.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_FDEGJOCDDGH.PARSER, input);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_FDEGJOCDDGH.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_FDEGJOCDDGH parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_FDEGJOCDDGH.PARSER, input);
        }
        
        public static Unk2700_FDEGJOCDDGH parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_FDEGJOCDDGH.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_FDEGJOCDDGH.PARSER, input);
        }
        
        public static Unk2700_FDEGJOCDDGH parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_FDEGJOCDDGH.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2700_FDEGJOCDDGH.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2700_FDEGJOCDDGH prototype) {
            return Unk2700_FDEGJOCDDGH.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2700_FDEGJOCDDGH.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2700_FDEGJOCDDGH getDefaultInstance() {
            return Unk2700_FDEGJOCDDGH.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2700_FDEGJOCDDGH> parser() {
            return Unk2700_FDEGJOCDDGH.PARSER;
        }
        
        @Override
        public Parser<Unk2700_FDEGJOCDDGH> getParserForType() {
            return Unk2700_FDEGJOCDDGH.PARSER;
        }
        
        @Override
        public Unk2700_FDEGJOCDDGH getDefaultInstanceForType() {
            return Unk2700_FDEGJOCDDGH.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2700_FDEGJOCDDGH();
            PARSER = new AbstractParser<Unk2700_FDEGJOCDDGH>() {
                @Override
                public Unk2700_FDEGJOCDDGH parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2700_FDEGJOCDDGH(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2700_FDEGJOCDDGHOrBuilder
        {
            private int curProgress_;
            private int challengeIndex_;
            private boolean isSuccess_;
            private int challengeId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_FDEGJOCDDGH.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2700_FDEGJOCDDGH.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.curProgress_ = 0;
                this.challengeIndex_ = 0;
                this.isSuccess_ = false;
                this.challengeId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_descriptor;
            }
            
            @Override
            public Unk2700_FDEGJOCDDGH getDefaultInstanceForType() {
                return Unk2700_FDEGJOCDDGH.getDefaultInstance();
            }
            
            @Override
            public Unk2700_FDEGJOCDDGH build() {
                final Unk2700_FDEGJOCDDGH result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2700_FDEGJOCDDGH buildPartial() {
                final Unk2700_FDEGJOCDDGH result = new Unk2700_FDEGJOCDDGH(this);
                result.curProgress_ = this.curProgress_;
                result.challengeIndex_ = this.challengeIndex_;
                result.isSuccess_ = this.isSuccess_;
                result.challengeId_ = this.challengeId_;
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
                if (other instanceof Unk2700_FDEGJOCDDGH) {
                    return this.mergeFrom((Unk2700_FDEGJOCDDGH)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2700_FDEGJOCDDGH other) {
                if (other == Unk2700_FDEGJOCDDGH.getDefaultInstance()) {
                    return this;
                }
                if (other.getCurProgress() != 0) {
                    this.setCurProgress(other.getCurProgress());
                }
                if (other.getChallengeIndex() != 0) {
                    this.setChallengeIndex(other.getChallengeIndex());
                }
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (other.getChallengeId() != 0) {
                    this.setChallengeId(other.getChallengeId());
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
                Unk2700_FDEGJOCDDGH parsedMessage = null;
                try {
                    parsedMessage = Unk2700_FDEGJOCDDGH.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2700_FDEGJOCDDGH)e.getUnfinishedMessage();
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
            public int getCurProgress() {
                return this.curProgress_;
            }
            
            public Builder setCurProgress(final int value) {
                this.curProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurProgress() {
                this.curProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getChallengeIndex() {
                return this.challengeIndex_;
            }
            
            public Builder setChallengeIndex(final int value) {
                this.challengeIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearChallengeIndex() {
                this.challengeIndex_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface Unk2700_FDEGJOCDDGHOrBuilder extends MessageOrBuilder
    {
        int getCurProgress();
        
        int getChallengeIndex();
        
        boolean getIsSuccess();
        
        int getChallengeId();
    }
}
