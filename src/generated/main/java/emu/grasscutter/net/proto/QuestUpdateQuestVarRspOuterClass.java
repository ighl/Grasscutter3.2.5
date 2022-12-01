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

public final class QuestUpdateQuestVarRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_QuestUpdateQuestVarRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QuestUpdateQuestVarRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QuestUpdateQuestVarRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QuestUpdateQuestVarRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cQuestUpdateQuestVarRsp.proto\"r\n\u0016QuestUpdateQuestVarRsp\u0012\u000f\n\u0007retcode\u0018\n \u0001(\u0005\u0012\u001c\n\u0014parent_quest_var_seq\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fparent_quest_id\u0018\b \u0001(\r\u0012\u0010\n\bquest_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QuestUpdateQuestVarRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_QuestUpdateQuestVarRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QuestUpdateQuestVarRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_descriptor, new String[] { "Retcode", "ParentQuestVarSeq", "ParentQuestId", "QuestId" });
    }
    
    public static final class QuestUpdateQuestVarRsp extends GeneratedMessageV3 implements QuestUpdateQuestVarRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 10;
        private int retcode_;
        public static final int PARENT_QUEST_VAR_SEQ_FIELD_NUMBER = 2;
        private int parentQuestVarSeq_;
        public static final int PARENT_QUEST_ID_FIELD_NUMBER = 8;
        private int parentQuestId_;
        public static final int QUEST_ID_FIELD_NUMBER = 15;
        private int questId_;
        private byte memoizedIsInitialized;
        private static final QuestUpdateQuestVarRsp DEFAULT_INSTANCE;
        private static final Parser<QuestUpdateQuestVarRsp> PARSER;
        
        private QuestUpdateQuestVarRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private QuestUpdateQuestVarRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QuestUpdateQuestVarRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QuestUpdateQuestVarRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.parentQuestVarSeq_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.parentQuestId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 120: {
                            this.questId_ = input.readUInt32();
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
            return QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestUpdateQuestVarRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getParentQuestVarSeq() {
            return this.parentQuestVarSeq_;
        }
        
        @Override
        public int getParentQuestId() {
            return this.parentQuestId_;
        }
        
        @Override
        public int getQuestId() {
            return this.questId_;
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
            if (this.parentQuestVarSeq_ != 0) {
                output.writeUInt32(2, this.parentQuestVarSeq_);
            }
            if (this.parentQuestId_ != 0) {
                output.writeUInt32(8, this.parentQuestId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(10, this.retcode_);
            }
            if (this.questId_ != 0) {
                output.writeUInt32(15, this.questId_);
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
            if (this.parentQuestVarSeq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.parentQuestVarSeq_);
            }
            if (this.parentQuestId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.parentQuestId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(10, this.retcode_);
            }
            if (this.questId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.questId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QuestUpdateQuestVarRsp)) {
                return super.equals(obj);
            }
            final QuestUpdateQuestVarRsp other = (QuestUpdateQuestVarRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getParentQuestVarSeq() == other.getParentQuestVarSeq() && this.getParentQuestId() == other.getParentQuestId() && this.getQuestId() == other.getQuestId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getParentQuestVarSeq();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getParentQuestId();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getQuestId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarRsp.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarRsp.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarRsp.PARSER.parseFrom(data);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestUpdateQuestVarRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarRsp.PARSER, input);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarRsp.PARSER, input, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestUpdateQuestVarRsp.PARSER, input);
        }
        
        public static QuestUpdateQuestVarRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestUpdateQuestVarRsp.PARSER, input, extensionRegistry);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarRsp.PARSER, input);
        }
        
        public static QuestUpdateQuestVarRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestUpdateQuestVarRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QuestUpdateQuestVarRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QuestUpdateQuestVarRsp prototype) {
            return QuestUpdateQuestVarRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QuestUpdateQuestVarRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QuestUpdateQuestVarRsp getDefaultInstance() {
            return QuestUpdateQuestVarRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<QuestUpdateQuestVarRsp> parser() {
            return QuestUpdateQuestVarRsp.PARSER;
        }
        
        @Override
        public Parser<QuestUpdateQuestVarRsp> getParserForType() {
            return QuestUpdateQuestVarRsp.PARSER;
        }
        
        @Override
        public QuestUpdateQuestVarRsp getDefaultInstanceForType() {
            return QuestUpdateQuestVarRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QuestUpdateQuestVarRsp();
            PARSER = new AbstractParser<QuestUpdateQuestVarRsp>() {
                @Override
                public QuestUpdateQuestVarRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QuestUpdateQuestVarRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuestUpdateQuestVarRspOrBuilder
        {
            private int retcode_;
            private int parentQuestVarSeq_;
            private int parentQuestId_;
            private int questId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestUpdateQuestVarRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QuestUpdateQuestVarRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.parentQuestVarSeq_ = 0;
                this.parentQuestId_ = 0;
                this.questId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QuestUpdateQuestVarRspOuterClass.internal_static_QuestUpdateQuestVarRsp_descriptor;
            }
            
            @Override
            public QuestUpdateQuestVarRsp getDefaultInstanceForType() {
                return QuestUpdateQuestVarRsp.getDefaultInstance();
            }
            
            @Override
            public QuestUpdateQuestVarRsp build() {
                final QuestUpdateQuestVarRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QuestUpdateQuestVarRsp buildPartial() {
                final QuestUpdateQuestVarRsp result = new QuestUpdateQuestVarRsp(this);
                result.retcode_ = this.retcode_;
                result.parentQuestVarSeq_ = this.parentQuestVarSeq_;
                result.parentQuestId_ = this.parentQuestId_;
                result.questId_ = this.questId_;
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
                if (other instanceof QuestUpdateQuestVarRsp) {
                    return this.mergeFrom((QuestUpdateQuestVarRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QuestUpdateQuestVarRsp other) {
                if (other == QuestUpdateQuestVarRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getParentQuestVarSeq() != 0) {
                    this.setParentQuestVarSeq(other.getParentQuestVarSeq());
                }
                if (other.getParentQuestId() != 0) {
                    this.setParentQuestId(other.getParentQuestId());
                }
                if (other.getQuestId() != 0) {
                    this.setQuestId(other.getQuestId());
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
                QuestUpdateQuestVarRsp parsedMessage = null;
                try {
                    parsedMessage = QuestUpdateQuestVarRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QuestUpdateQuestVarRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentQuestVarSeq() {
                return this.parentQuestVarSeq_;
            }
            
            public Builder setParentQuestVarSeq(final int value) {
                this.parentQuestVarSeq_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestVarSeq() {
                this.parentQuestVarSeq_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParentQuestId() {
                return this.parentQuestId_;
            }
            
            public Builder setParentQuestId(final int value) {
                this.parentQuestId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParentQuestId() {
                this.parentQuestId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getQuestId() {
                return this.questId_;
            }
            
            public Builder setQuestId(final int value) {
                this.questId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestId() {
                this.questId_ = 0;
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
    
    public interface QuestUpdateQuestVarRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getParentQuestVarSeq();
        
        int getParentQuestId();
        
        int getQuestId();
    }
}
