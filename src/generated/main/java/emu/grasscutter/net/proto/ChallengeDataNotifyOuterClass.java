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

public final class ChallengeDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ChallengeDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ChallengeDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ChallengeDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ChallengeDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019ChallengeDataNotify.proto\"R\n\u0013ChallengeDataNotify\u0012\r\n\u0005value\u0018\b \u0001(\r\u0012\u0017\n\u000fchallenge_index\u0018\u0002 \u0001(\r\u0012\u0013\n\u000bparam_index\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ChallengeDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ChallengeDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ChallengeDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ChallengeDataNotifyOuterClass.internal_static_ChallengeDataNotify_descriptor, new String[] { "Value", "ChallengeIndex", "ParamIndex" });
    }
    
    public static final class ChallengeDataNotify extends GeneratedMessageV3 implements ChallengeDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int VALUE_FIELD_NUMBER = 8;
        private int value_;
        public static final int CHALLENGE_INDEX_FIELD_NUMBER = 2;
        private int challengeIndex_;
        public static final int PARAM_INDEX_FIELD_NUMBER = 9;
        private int paramIndex_;
        private byte memoizedIsInitialized;
        private static final ChallengeDataNotify DEFAULT_INSTANCE;
        private static final Parser<ChallengeDataNotify> PARSER;
        
        private ChallengeDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ChallengeDataNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ChallengeDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ChallengeDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.challengeIndex_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.value_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.paramIndex_ = input.readUInt32();
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
            return ChallengeDataNotifyOuterClass.internal_static_ChallengeDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ChallengeDataNotifyOuterClass.internal_static_ChallengeDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ChallengeDataNotify.class, Builder.class);
        }
        
        @Override
        public int getValue() {
            return this.value_;
        }
        
        @Override
        public int getChallengeIndex() {
            return this.challengeIndex_;
        }
        
        @Override
        public int getParamIndex() {
            return this.paramIndex_;
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
            if (this.challengeIndex_ != 0) {
                output.writeUInt32(2, this.challengeIndex_);
            }
            if (this.value_ != 0) {
                output.writeUInt32(8, this.value_);
            }
            if (this.paramIndex_ != 0) {
                output.writeUInt32(9, this.paramIndex_);
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
            if (this.challengeIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.challengeIndex_);
            }
            if (this.value_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.value_);
            }
            if (this.paramIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.paramIndex_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChallengeDataNotify)) {
                return super.equals(obj);
            }
            final ChallengeDataNotify other = (ChallengeDataNotify)obj;
            return this.getValue() == other.getValue() && this.getChallengeIndex() == other.getChallengeIndex() && this.getParamIndex() == other.getParamIndex() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getValue();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getChallengeIndex();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getParamIndex();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ChallengeDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ChallengeDataNotify.PARSER.parseFrom(data);
        }
        
        public static ChallengeDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChallengeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChallengeDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ChallengeDataNotify.PARSER.parseFrom(data);
        }
        
        public static ChallengeDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChallengeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChallengeDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ChallengeDataNotify.PARSER.parseFrom(data);
        }
        
        public static ChallengeDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChallengeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChallengeDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChallengeDataNotify.PARSER, input);
        }
        
        public static ChallengeDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChallengeDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static ChallengeDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChallengeDataNotify.PARSER, input);
        }
        
        public static ChallengeDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChallengeDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static ChallengeDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChallengeDataNotify.PARSER, input);
        }
        
        public static ChallengeDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChallengeDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ChallengeDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ChallengeDataNotify prototype) {
            return ChallengeDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ChallengeDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ChallengeDataNotify getDefaultInstance() {
            return ChallengeDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ChallengeDataNotify> parser() {
            return ChallengeDataNotify.PARSER;
        }
        
        @Override
        public Parser<ChallengeDataNotify> getParserForType() {
            return ChallengeDataNotify.PARSER;
        }
        
        @Override
        public ChallengeDataNotify getDefaultInstanceForType() {
            return ChallengeDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ChallengeDataNotify();
            PARSER = new AbstractParser<ChallengeDataNotify>() {
                @Override
                public ChallengeDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ChallengeDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChallengeDataNotifyOrBuilder
        {
            private int value_;
            private int challengeIndex_;
            private int paramIndex_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ChallengeDataNotifyOuterClass.internal_static_ChallengeDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ChallengeDataNotifyOuterClass.internal_static_ChallengeDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ChallengeDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ChallengeDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.value_ = 0;
                this.challengeIndex_ = 0;
                this.paramIndex_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ChallengeDataNotifyOuterClass.internal_static_ChallengeDataNotify_descriptor;
            }
            
            @Override
            public ChallengeDataNotify getDefaultInstanceForType() {
                return ChallengeDataNotify.getDefaultInstance();
            }
            
            @Override
            public ChallengeDataNotify build() {
                final ChallengeDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ChallengeDataNotify buildPartial() {
                final ChallengeDataNotify result = new ChallengeDataNotify(this);
                result.value_ = this.value_;
                result.challengeIndex_ = this.challengeIndex_;
                result.paramIndex_ = this.paramIndex_;
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
                if (other instanceof ChallengeDataNotify) {
                    return this.mergeFrom((ChallengeDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ChallengeDataNotify other) {
                if (other == ChallengeDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getValue() != 0) {
                    this.setValue(other.getValue());
                }
                if (other.getChallengeIndex() != 0) {
                    this.setChallengeIndex(other.getChallengeIndex());
                }
                if (other.getParamIndex() != 0) {
                    this.setParamIndex(other.getParamIndex());
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
                ChallengeDataNotify parsedMessage = null;
                try {
                    parsedMessage = ChallengeDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ChallengeDataNotify)e.getUnfinishedMessage();
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
            public int getValue() {
                return this.value_;
            }
            
            public Builder setValue(final int value) {
                this.value_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearValue() {
                this.value_ = 0;
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
            public int getParamIndex() {
                return this.paramIndex_;
            }
            
            public Builder setParamIndex(final int value) {
                this.paramIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParamIndex() {
                this.paramIndex_ = 0;
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
    
    public interface ChallengeDataNotifyOrBuilder extends MessageOrBuilder
    {
        int getValue();
        
        int getChallengeIndex();
        
        int getParamIndex();
    }
}
