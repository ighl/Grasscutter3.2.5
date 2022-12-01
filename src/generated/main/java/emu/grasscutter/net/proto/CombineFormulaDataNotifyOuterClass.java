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

public final class CombineFormulaDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CombineFormulaDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CombineFormulaDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CombineFormulaDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CombineFormulaDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eCombineFormulaDataNotify.proto\"A\n\u0018CombineFormulaDataNotify\u0012\u0012\n\ncombine_id\u0018\u0006 \u0001(\r\u0012\u0011\n\tis_locked\u0018\u0003 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CombineFormulaDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CombineFormulaDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CombineFormulaDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_descriptor, new String[] { "CombineId", "IsLocked" });
    }
    
    public static final class CombineFormulaDataNotify extends GeneratedMessageV3 implements CombineFormulaDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COMBINE_ID_FIELD_NUMBER = 6;
        private int combineId_;
        public static final int IS_LOCKED_FIELD_NUMBER = 3;
        private boolean isLocked_;
        private byte memoizedIsInitialized;
        private static final CombineFormulaDataNotify DEFAULT_INSTANCE;
        private static final Parser<CombineFormulaDataNotify> PARSER;
        
        private CombineFormulaDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CombineFormulaDataNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CombineFormulaDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CombineFormulaDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.isLocked_ = input.readBool();
                            continue;
                        }
                        case 48: {
                            this.combineId_ = input.readUInt32();
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
            return CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CombineFormulaDataNotify.class, Builder.class);
        }
        
        @Override
        public int getCombineId() {
            return this.combineId_;
        }
        
        @Override
        public boolean getIsLocked() {
            return this.isLocked_;
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
            if (this.isLocked_) {
                output.writeBool(3, this.isLocked_);
            }
            if (this.combineId_ != 0) {
                output.writeUInt32(6, this.combineId_);
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
            if (this.isLocked_) {
                size += CodedOutputStream.computeBoolSize(3, this.isLocked_);
            }
            if (this.combineId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.combineId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CombineFormulaDataNotify)) {
                return super.equals(obj);
            }
            final CombineFormulaDataNotify other = (CombineFormulaDataNotify)obj;
            return this.getCombineId() == other.getCombineId() && this.getIsLocked() == other.getIsLocked() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getCombineId();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsLocked());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CombineFormulaDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CombineFormulaDataNotify.PARSER.parseFrom(data);
        }
        
        public static CombineFormulaDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineFormulaDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineFormulaDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CombineFormulaDataNotify.PARSER.parseFrom(data);
        }
        
        public static CombineFormulaDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineFormulaDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineFormulaDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CombineFormulaDataNotify.PARSER.parseFrom(data);
        }
        
        public static CombineFormulaDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CombineFormulaDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CombineFormulaDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineFormulaDataNotify.PARSER, input);
        }
        
        public static CombineFormulaDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineFormulaDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CombineFormulaDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombineFormulaDataNotify.PARSER, input);
        }
        
        public static CombineFormulaDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CombineFormulaDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CombineFormulaDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineFormulaDataNotify.PARSER, input);
        }
        
        public static CombineFormulaDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CombineFormulaDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CombineFormulaDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CombineFormulaDataNotify prototype) {
            return CombineFormulaDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CombineFormulaDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CombineFormulaDataNotify getDefaultInstance() {
            return CombineFormulaDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CombineFormulaDataNotify> parser() {
            return CombineFormulaDataNotify.PARSER;
        }
        
        @Override
        public Parser<CombineFormulaDataNotify> getParserForType() {
            return CombineFormulaDataNotify.PARSER;
        }
        
        @Override
        public CombineFormulaDataNotify getDefaultInstanceForType() {
            return CombineFormulaDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CombineFormulaDataNotify();
            PARSER = new AbstractParser<CombineFormulaDataNotify>() {
                @Override
                public CombineFormulaDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CombineFormulaDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CombineFormulaDataNotifyOrBuilder
        {
            private int combineId_;
            private boolean isLocked_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CombineFormulaDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CombineFormulaDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.combineId_ = 0;
                this.isLocked_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CombineFormulaDataNotifyOuterClass.internal_static_CombineFormulaDataNotify_descriptor;
            }
            
            @Override
            public CombineFormulaDataNotify getDefaultInstanceForType() {
                return CombineFormulaDataNotify.getDefaultInstance();
            }
            
            @Override
            public CombineFormulaDataNotify build() {
                final CombineFormulaDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CombineFormulaDataNotify buildPartial() {
                final CombineFormulaDataNotify result = new CombineFormulaDataNotify(this);
                result.combineId_ = this.combineId_;
                result.isLocked_ = this.isLocked_;
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
                if (other instanceof CombineFormulaDataNotify) {
                    return this.mergeFrom((CombineFormulaDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CombineFormulaDataNotify other) {
                if (other == CombineFormulaDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getCombineId() != 0) {
                    this.setCombineId(other.getCombineId());
                }
                if (other.getIsLocked()) {
                    this.setIsLocked(other.getIsLocked());
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
                CombineFormulaDataNotify parsedMessage = null;
                try {
                    parsedMessage = CombineFormulaDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CombineFormulaDataNotify)e.getUnfinishedMessage();
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
            public int getCombineId() {
                return this.combineId_;
            }
            
            public Builder setCombineId(final int value) {
                this.combineId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCombineId() {
                this.combineId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsLocked() {
                return this.isLocked_;
            }
            
            public Builder setIsLocked(final boolean value) {
                this.isLocked_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsLocked() {
                this.isLocked_ = false;
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
    
    public interface CombineFormulaDataNotifyOrBuilder extends MessageOrBuilder
    {
        int getCombineId();
        
        boolean getIsLocked();
    }
}
