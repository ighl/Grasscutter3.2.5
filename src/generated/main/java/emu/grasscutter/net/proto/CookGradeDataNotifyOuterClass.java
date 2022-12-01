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

public final class CookGradeDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CookGradeDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CookGradeDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CookGradeDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CookGradeDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019CookGradeDataNotify.proto\"$\n\u0013CookGradeDataNotify\u0012\r\n\u0005grade\u0018\f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CookGradeDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CookGradeDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CookGradeDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CookGradeDataNotifyOuterClass.internal_static_CookGradeDataNotify_descriptor, new String[] { "Grade" });
    }
    
    public static final class CookGradeDataNotify extends GeneratedMessageV3 implements CookGradeDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GRADE_FIELD_NUMBER = 12;
        private int grade_;
        private byte memoizedIsInitialized;
        private static final CookGradeDataNotify DEFAULT_INSTANCE;
        private static final Parser<CookGradeDataNotify> PARSER;
        
        private CookGradeDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CookGradeDataNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CookGradeDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CookGradeDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 96: {
                            this.grade_ = input.readUInt32();
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
            return CookGradeDataNotifyOuterClass.internal_static_CookGradeDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CookGradeDataNotifyOuterClass.internal_static_CookGradeDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CookGradeDataNotify.class, Builder.class);
        }
        
        @Override
        public int getGrade() {
            return this.grade_;
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
            if (this.grade_ != 0) {
                output.writeUInt32(12, this.grade_);
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
            if (this.grade_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.grade_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CookGradeDataNotify)) {
                return super.equals(obj);
            }
            final CookGradeDataNotify other = (CookGradeDataNotify)obj;
            return this.getGrade() == other.getGrade() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getGrade();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CookGradeDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CookGradeDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookGradeDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookGradeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookGradeDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CookGradeDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookGradeDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookGradeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookGradeDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CookGradeDataNotify.PARSER.parseFrom(data);
        }
        
        public static CookGradeDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CookGradeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CookGradeDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookGradeDataNotify.PARSER, input);
        }
        
        public static CookGradeDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookGradeDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CookGradeDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CookGradeDataNotify.PARSER, input);
        }
        
        public static CookGradeDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CookGradeDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static CookGradeDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookGradeDataNotify.PARSER, input);
        }
        
        public static CookGradeDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CookGradeDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CookGradeDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CookGradeDataNotify prototype) {
            return CookGradeDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CookGradeDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CookGradeDataNotify getDefaultInstance() {
            return CookGradeDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CookGradeDataNotify> parser() {
            return CookGradeDataNotify.PARSER;
        }
        
        @Override
        public Parser<CookGradeDataNotify> getParserForType() {
            return CookGradeDataNotify.PARSER;
        }
        
        @Override
        public CookGradeDataNotify getDefaultInstanceForType() {
            return CookGradeDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CookGradeDataNotify();
            PARSER = new AbstractParser<CookGradeDataNotify>() {
                @Override
                public CookGradeDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CookGradeDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CookGradeDataNotifyOrBuilder
        {
            private int grade_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CookGradeDataNotifyOuterClass.internal_static_CookGradeDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CookGradeDataNotifyOuterClass.internal_static_CookGradeDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CookGradeDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CookGradeDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.grade_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CookGradeDataNotifyOuterClass.internal_static_CookGradeDataNotify_descriptor;
            }
            
            @Override
            public CookGradeDataNotify getDefaultInstanceForType() {
                return CookGradeDataNotify.getDefaultInstance();
            }
            
            @Override
            public CookGradeDataNotify build() {
                final CookGradeDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CookGradeDataNotify buildPartial() {
                final CookGradeDataNotify result = new CookGradeDataNotify(this);
                result.grade_ = this.grade_;
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
                if (other instanceof CookGradeDataNotify) {
                    return this.mergeFrom((CookGradeDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CookGradeDataNotify other) {
                if (other == CookGradeDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getGrade() != 0) {
                    this.setGrade(other.getGrade());
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
                CookGradeDataNotify parsedMessage = null;
                try {
                    parsedMessage = CookGradeDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CookGradeDataNotify)e.getUnfinishedMessage();
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
            public int getGrade() {
                return this.grade_;
            }
            
            public Builder setGrade(final int value) {
                this.grade_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGrade() {
                this.grade_ = 0;
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
    
    public interface CookGradeDataNotifyOrBuilder extends MessageOrBuilder
    {
        int getGrade();
    }
}
