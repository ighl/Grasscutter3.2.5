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

public final class QuestVarOpOuterClass
{
    private static final Descriptors.Descriptor internal_static_QuestVarOp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QuestVarOp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QuestVarOpOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QuestVarOpOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010QuestVarOp.proto\":\n\nQuestVarOp\u0012\r\n\u0005index\u0018\t \u0001(\r\u0012\r\n\u0005value\u0018\u0005 \u0001(\u0005\u0012\u000e\n\u0006is_add\u0018\u0006 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QuestVarOpOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_QuestVarOp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QuestVarOp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuestVarOpOuterClass.internal_static_QuestVarOp_descriptor, new String[] { "Index", "Value", "IsAdd" });
    }
    
    public static final class QuestVarOp extends GeneratedMessageV3 implements QuestVarOpOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int INDEX_FIELD_NUMBER = 9;
        private int index_;
        public static final int VALUE_FIELD_NUMBER = 5;
        private int value_;
        public static final int IS_ADD_FIELD_NUMBER = 6;
        private boolean isAdd_;
        private byte memoizedIsInitialized;
        private static final QuestVarOp DEFAULT_INSTANCE;
        private static final Parser<QuestVarOp> PARSER;
        
        private QuestVarOp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private QuestVarOp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QuestVarOp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QuestVarOp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.value_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            this.isAdd_ = input.readBool();
                            continue;
                        }
                        case 72: {
                            this.index_ = input.readUInt32();
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
            return QuestVarOpOuterClass.internal_static_QuestVarOp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuestVarOpOuterClass.internal_static_QuestVarOp_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestVarOp.class, Builder.class);
        }
        
        @Override
        public int getIndex() {
            return this.index_;
        }
        
        @Override
        public int getValue() {
            return this.value_;
        }
        
        @Override
        public boolean getIsAdd() {
            return this.isAdd_;
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
            if (this.value_ != 0) {
                output.writeInt32(5, this.value_);
            }
            if (this.isAdd_) {
                output.writeBool(6, this.isAdd_);
            }
            if (this.index_ != 0) {
                output.writeUInt32(9, this.index_);
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
            if (this.value_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.value_);
            }
            if (this.isAdd_) {
                size += CodedOutputStream.computeBoolSize(6, this.isAdd_);
            }
            if (this.index_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.index_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QuestVarOp)) {
                return super.equals(obj);
            }
            final QuestVarOp other = (QuestVarOp)obj;
            return this.getIndex() == other.getIndex() && this.getValue() == other.getValue() && this.getIsAdd() == other.getIsAdd() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getIndex();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getValue();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAdd());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QuestVarOp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QuestVarOp.PARSER.parseFrom(data);
        }
        
        public static QuestVarOp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestVarOp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestVarOp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QuestVarOp.PARSER.parseFrom(data);
        }
        
        public static QuestVarOp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestVarOp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestVarOp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QuestVarOp.PARSER.parseFrom(data);
        }
        
        public static QuestVarOp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestVarOp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestVarOp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestVarOp.PARSER, input);
        }
        
        public static QuestVarOp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestVarOp.PARSER, input, extensionRegistry);
        }
        
        public static QuestVarOp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestVarOp.PARSER, input);
        }
        
        public static QuestVarOp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestVarOp.PARSER, input, extensionRegistry);
        }
        
        public static QuestVarOp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestVarOp.PARSER, input);
        }
        
        public static QuestVarOp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestVarOp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QuestVarOp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QuestVarOp prototype) {
            return QuestVarOp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QuestVarOp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QuestVarOp getDefaultInstance() {
            return QuestVarOp.DEFAULT_INSTANCE;
        }
        
        public static Parser<QuestVarOp> parser() {
            return QuestVarOp.PARSER;
        }
        
        @Override
        public Parser<QuestVarOp> getParserForType() {
            return QuestVarOp.PARSER;
        }
        
        @Override
        public QuestVarOp getDefaultInstanceForType() {
            return QuestVarOp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QuestVarOp();
            PARSER = new AbstractParser<QuestVarOp>() {
                @Override
                public QuestVarOp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QuestVarOp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuestVarOpOrBuilder
        {
            private int index_;
            private int value_;
            private boolean isAdd_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QuestVarOpOuterClass.internal_static_QuestVarOp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuestVarOpOuterClass.internal_static_QuestVarOp_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestVarOp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QuestVarOp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.index_ = 0;
                this.value_ = 0;
                this.isAdd_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QuestVarOpOuterClass.internal_static_QuestVarOp_descriptor;
            }
            
            @Override
            public QuestVarOp getDefaultInstanceForType() {
                return QuestVarOp.getDefaultInstance();
            }
            
            @Override
            public QuestVarOp build() {
                final QuestVarOp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QuestVarOp buildPartial() {
                final QuestVarOp result = new QuestVarOp(this);
                result.index_ = this.index_;
                result.value_ = this.value_;
                result.isAdd_ = this.isAdd_;
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
                if (other instanceof QuestVarOp) {
                    return this.mergeFrom((QuestVarOp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QuestVarOp other) {
                if (other == QuestVarOp.getDefaultInstance()) {
                    return this;
                }
                if (other.getIndex() != 0) {
                    this.setIndex(other.getIndex());
                }
                if (other.getValue() != 0) {
                    this.setValue(other.getValue());
                }
                if (other.getIsAdd()) {
                    this.setIsAdd(other.getIsAdd());
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
                QuestVarOp parsedMessage = null;
                try {
                    parsedMessage = QuestVarOp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QuestVarOp)e.getUnfinishedMessage();
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
            public int getIndex() {
                return this.index_;
            }
            
            public Builder setIndex(final int value) {
                this.index_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIndex() {
                this.index_ = 0;
                this.onChanged();
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
            public boolean getIsAdd() {
                return this.isAdd_;
            }
            
            public Builder setIsAdd(final boolean value) {
                this.isAdd_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAdd() {
                this.isAdd_ = false;
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
    
    public interface QuestVarOpOrBuilder extends MessageOrBuilder
    {
        int getIndex();
        
        int getValue();
        
        boolean getIsAdd();
    }
}
