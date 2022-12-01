// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PacketHeadOuterClass
{
    private static final Descriptors.Descriptor internal_static_PacketHead_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PacketHead_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_PacketHead_ExtMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PacketHead_ExtMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_PacketHead_ServiceAppIdMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PacketHead_ServiceAppIdMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PacketHeadOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PacketHeadOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010PacketHead.proto\"\u00c8\u0004\n\nPacketHead\u0012\u0011\n\tpacket_id\u0018\u0001 \u0001(\r\u0012\u000e\n\u0006rpc_id\u0018\u0002 \u0001(\r\u0012\u001a\n\u0012client_sequence_id\u0018\u0003 \u0001(\r\u0012\u0017\n\u000fenet_channel_id\u0018\u0004 \u0001(\r\u0012\u0018\n\u0010enet_is_reliable\u0018\u0005 \u0001(\r\u0012\u000f\n\u0007sent_ms\u0018\u0006 \u0001(\u0004\u0012\u000f\n\u0007user_id\u0018\u000b \u0001(\r\u0012\u000f\n\u0007user_ip\u0018\f \u0001(\r\u0012\u0017\n\u000fuser_session_id\u0018\r \u0001(\r\u0012\u0014\n\frecv_time_ms\u0018\u0015 \u0001(\u0004\u0012\u0019\n\u0011rpc_begin_time_ms\u0018\u0016 \u0001(\r\u0012(\n\u0007ext_map\u0018\u0017 \u0003(\u000b2\u0017.PacketHead.ExtMapEntry\u0012\u0015\n\rsender_app_id\u0018\u0018 \u0001(\r\u0012\u0016\n\u000esource_service\u0018\u001f \u0001(\r\u0012\u0016\n\u000etarget_service\u0018  \u0001(\r\u0012<\n\u0012service_app_id_map\u0018! \u0003(\u000b2 .PacketHead.ServiceAppIdMapEntry\u0012\u001a\n\u0012is_set_game_thread\u0018\" \u0001(\b\u0012\u0019\n\u0011game_thread_index\u0018# \u0001(\r\u001a-\n\u000bExtMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001\u001a6\n\u0014ServiceAppIdMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PacketHeadOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PacketHead_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PacketHead_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PacketHeadOuterClass.internal_static_PacketHead_descriptor, new String[] { "PacketId", "RpcId", "ClientSequenceId", "EnetChannelId", "EnetIsReliable", "SentMs", "UserId", "UserIp", "UserSessionId", "RecvTimeMs", "RpcBeginTimeMs", "ExtMap", "SenderAppId", "SourceService", "TargetService", "ServiceAppIdMap", "IsSetGameThread", "GameThreadIndex" });
        internal_static_PacketHead_ExtMapEntry_descriptor = PacketHeadOuterClass.internal_static_PacketHead_descriptor.getNestedTypes().get(0);
        internal_static_PacketHead_ExtMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PacketHeadOuterClass.internal_static_PacketHead_ExtMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_PacketHead_ServiceAppIdMapEntry_descriptor = PacketHeadOuterClass.internal_static_PacketHead_descriptor.getNestedTypes().get(1);
        internal_static_PacketHead_ServiceAppIdMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PacketHeadOuterClass.internal_static_PacketHead_ServiceAppIdMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class PacketHead extends GeneratedMessageV3 implements PacketHeadOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PACKET_ID_FIELD_NUMBER = 1;
        private int packetId_;
        public static final int RPC_ID_FIELD_NUMBER = 2;
        private int rpcId_;
        public static final int CLIENT_SEQUENCE_ID_FIELD_NUMBER = 3;
        private int clientSequenceId_;
        public static final int ENET_CHANNEL_ID_FIELD_NUMBER = 4;
        private int enetChannelId_;
        public static final int ENET_IS_RELIABLE_FIELD_NUMBER = 5;
        private int enetIsReliable_;
        public static final int SENT_MS_FIELD_NUMBER = 6;
        private long sentMs_;
        public static final int USER_ID_FIELD_NUMBER = 11;
        private int userId_;
        public static final int USER_IP_FIELD_NUMBER = 12;
        private int userIp_;
        public static final int USER_SESSION_ID_FIELD_NUMBER = 13;
        private int userSessionId_;
        public static final int RECV_TIME_MS_FIELD_NUMBER = 21;
        private long recvTimeMs_;
        public static final int RPC_BEGIN_TIME_MS_FIELD_NUMBER = 22;
        private int rpcBeginTimeMs_;
        public static final int EXT_MAP_FIELD_NUMBER = 23;
        private MapField<Integer, Integer> extMap_;
        public static final int SENDER_APP_ID_FIELD_NUMBER = 24;
        private int senderAppId_;
        public static final int SOURCE_SERVICE_FIELD_NUMBER = 31;
        private int sourceService_;
        public static final int TARGET_SERVICE_FIELD_NUMBER = 32;
        private int targetService_;
        public static final int SERVICE_APP_ID_MAP_FIELD_NUMBER = 33;
        private MapField<Integer, Integer> serviceAppIdMap_;
        public static final int IS_SET_GAME_THREAD_FIELD_NUMBER = 34;
        private boolean isSetGameThread_;
        public static final int GAME_THREAD_INDEX_FIELD_NUMBER = 35;
        private int gameThreadIndex_;
        private byte memoizedIsInitialized;
        private static final PacketHead DEFAULT_INSTANCE;
        private static final Parser<PacketHead> PARSER;
        
        private PacketHead(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PacketHead() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PacketHead();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PacketHead(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                            this.packetId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.rpcId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.clientSequenceId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.enetChannelId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.enetIsReliable_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.sentMs_ = input.readUInt64();
                            continue;
                        }
                        case 88: {
                            this.userId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.userIp_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.userSessionId_ = input.readUInt32();
                            continue;
                        }
                        case 168: {
                            this.recvTimeMs_ = input.readUInt64();
                            continue;
                        }
                        case 176: {
                            this.rpcBeginTimeMs_ = input.readUInt32();
                            continue;
                        }
                        case 186: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.extMap_ = MapField.newMapField(ExtMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> extMap__ = input.readMessage(ExtMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.extMap_.getMutableMap().put(extMap__.getKey(), extMap__.getValue());
                            continue;
                        }
                        case 192: {
                            this.senderAppId_ = input.readUInt32();
                            continue;
                        }
                        case 248: {
                            this.sourceService_ = input.readUInt32();
                            continue;
                        }
                        case 256: {
                            this.targetService_ = input.readUInt32();
                            continue;
                        }
                        case 266: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.serviceAppIdMap_ = MapField.newMapField(ServiceAppIdMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, Integer> serviceAppIdMap__ = input.readMessage(ServiceAppIdMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.serviceAppIdMap_.getMutableMap().put(serviceAppIdMap__.getKey(), serviceAppIdMap__.getValue());
                            continue;
                        }
                        case 272: {
                            this.isSetGameThread_ = input.readBool();
                            continue;
                        }
                        case 280: {
                            this.gameThreadIndex_ = input.readUInt32();
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
            return PacketHeadOuterClass.internal_static_PacketHead_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 23: {
                    return this.internalGetExtMap();
                }
                case 33: {
                    return this.internalGetServiceAppIdMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PacketHeadOuterClass.internal_static_PacketHead_fieldAccessorTable.ensureFieldAccessorsInitialized(PacketHead.class, Builder.class);
        }
        
        @Override
        public int getPacketId() {
            return this.packetId_;
        }
        
        @Override
        public int getRpcId() {
            return this.rpcId_;
        }
        
        @Override
        public int getClientSequenceId() {
            return this.clientSequenceId_;
        }
        
        @Override
        public int getEnetChannelId() {
            return this.enetChannelId_;
        }
        
        @Override
        public int getEnetIsReliable() {
            return this.enetIsReliable_;
        }
        
        @Override
        public long getSentMs() {
            return this.sentMs_;
        }
        
        @Override
        public int getUserId() {
            return this.userId_;
        }
        
        @Override
        public int getUserIp() {
            return this.userIp_;
        }
        
        @Override
        public int getUserSessionId() {
            return this.userSessionId_;
        }
        
        @Override
        public long getRecvTimeMs() {
            return this.recvTimeMs_;
        }
        
        @Override
        public int getRpcBeginTimeMs() {
            return this.rpcBeginTimeMs_;
        }
        
        private MapField<Integer, Integer> internalGetExtMap() {
            if (this.extMap_ == null) {
                return MapField.emptyMapField(ExtMapDefaultEntryHolder.defaultEntry);
            }
            return this.extMap_;
        }
        
        @Override
        public int getExtMapCount() {
            return this.internalGetExtMap().getMap().size();
        }
        
        @Override
        public boolean containsExtMap(final int key) {
            return this.internalGetExtMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getExtMap() {
            return this.getExtMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getExtMapMap() {
            return this.internalGetExtMap().getMap();
        }
        
        @Override
        public int getExtMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetExtMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getExtMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetExtMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getSenderAppId() {
            return this.senderAppId_;
        }
        
        @Override
        public int getSourceService() {
            return this.sourceService_;
        }
        
        @Override
        public int getTargetService() {
            return this.targetService_;
        }
        
        private MapField<Integer, Integer> internalGetServiceAppIdMap() {
            if (this.serviceAppIdMap_ == null) {
                return MapField.emptyMapField(ServiceAppIdMapDefaultEntryHolder.defaultEntry);
            }
            return this.serviceAppIdMap_;
        }
        
        @Override
        public int getServiceAppIdMapCount() {
            return this.internalGetServiceAppIdMap().getMap().size();
        }
        
        @Override
        public boolean containsServiceAppIdMap(final int key) {
            return this.internalGetServiceAppIdMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getServiceAppIdMap() {
            return this.getServiceAppIdMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getServiceAppIdMapMap() {
            return this.internalGetServiceAppIdMap().getMap();
        }
        
        @Override
        public int getServiceAppIdMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetServiceAppIdMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getServiceAppIdMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetServiceAppIdMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public boolean getIsSetGameThread() {
            return this.isSetGameThread_;
        }
        
        @Override
        public int getGameThreadIndex() {
            return this.gameThreadIndex_;
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
            if (this.packetId_ != 0) {
                output.writeUInt32(1, this.packetId_);
            }
            if (this.rpcId_ != 0) {
                output.writeUInt32(2, this.rpcId_);
            }
            if (this.clientSequenceId_ != 0) {
                output.writeUInt32(3, this.clientSequenceId_);
            }
            if (this.enetChannelId_ != 0) {
                output.writeUInt32(4, this.enetChannelId_);
            }
            if (this.enetIsReliable_ != 0) {
                output.writeUInt32(5, this.enetIsReliable_);
            }
            if (this.sentMs_ != 0L) {
                output.writeUInt64(6, this.sentMs_);
            }
            if (this.userId_ != 0) {
                output.writeUInt32(11, this.userId_);
            }
            if (this.userIp_ != 0) {
                output.writeUInt32(12, this.userIp_);
            }
            if (this.userSessionId_ != 0) {
                output.writeUInt32(13, this.userSessionId_);
            }
            if (this.recvTimeMs_ != 0L) {
                output.writeUInt64(21, this.recvTimeMs_);
            }
            if (this.rpcBeginTimeMs_ != 0) {
                output.writeUInt32(22, this.rpcBeginTimeMs_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetExtMap(), ExtMapDefaultEntryHolder.defaultEntry, 23);
            if (this.senderAppId_ != 0) {
                output.writeUInt32(24, this.senderAppId_);
            }
            if (this.sourceService_ != 0) {
                output.writeUInt32(31, this.sourceService_);
            }
            if (this.targetService_ != 0) {
                output.writeUInt32(32, this.targetService_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetServiceAppIdMap(), ServiceAppIdMapDefaultEntryHolder.defaultEntry, 33);
            if (this.isSetGameThread_) {
                output.writeBool(34, this.isSetGameThread_);
            }
            if (this.gameThreadIndex_ != 0) {
                output.writeUInt32(35, this.gameThreadIndex_);
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
            if (this.packetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.packetId_);
            }
            if (this.rpcId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.rpcId_);
            }
            if (this.clientSequenceId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.clientSequenceId_);
            }
            if (this.enetChannelId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.enetChannelId_);
            }
            if (this.enetIsReliable_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.enetIsReliable_);
            }
            if (this.sentMs_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(6, this.sentMs_);
            }
            if (this.userId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.userId_);
            }
            if (this.userIp_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.userIp_);
            }
            if (this.userSessionId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.userSessionId_);
            }
            if (this.recvTimeMs_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(21, this.recvTimeMs_);
            }
            if (this.rpcBeginTimeMs_ != 0) {
                size += CodedOutputStream.computeUInt32Size(22, this.rpcBeginTimeMs_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetExtMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> extMap__ = ExtMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(23, extMap__);
            }
            if (this.senderAppId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(24, this.senderAppId_);
            }
            if (this.sourceService_ != 0) {
                size += CodedOutputStream.computeUInt32Size(31, this.sourceService_);
            }
            if (this.targetService_ != 0) {
                size += CodedOutputStream.computeUInt32Size(32, this.targetService_);
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetServiceAppIdMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> serviceAppIdMap__ = ServiceAppIdMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(33, serviceAppIdMap__);
            }
            if (this.isSetGameThread_) {
                size += CodedOutputStream.computeBoolSize(34, this.isSetGameThread_);
            }
            if (this.gameThreadIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(35, this.gameThreadIndex_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PacketHead)) {
                return super.equals(obj);
            }
            final PacketHead other = (PacketHead)obj;
            return this.getPacketId() == other.getPacketId() && this.getRpcId() == other.getRpcId() && this.getClientSequenceId() == other.getClientSequenceId() && this.getEnetChannelId() == other.getEnetChannelId() && this.getEnetIsReliable() == other.getEnetIsReliable() && this.getSentMs() == other.getSentMs() && this.getUserId() == other.getUserId() && this.getUserIp() == other.getUserIp() && this.getUserSessionId() == other.getUserSessionId() && this.getRecvTimeMs() == other.getRecvTimeMs() && this.getRpcBeginTimeMs() == other.getRpcBeginTimeMs() && this.internalGetExtMap().equals(other.internalGetExtMap()) && this.getSenderAppId() == other.getSenderAppId() && this.getSourceService() == other.getSourceService() && this.getTargetService() == other.getTargetService() && this.internalGetServiceAppIdMap().equals(other.internalGetServiceAppIdMap()) && this.getIsSetGameThread() == other.getIsSetGameThread() && this.getGameThreadIndex() == other.getGameThreadIndex() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getPacketId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRpcId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getClientSequenceId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getEnetChannelId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getEnetIsReliable();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getSentMs());
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getUserId();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getUserIp();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getUserSessionId();
            hash = 37 * hash + 21;
            hash = 53 * hash + Internal.hashLong(this.getRecvTimeMs());
            hash = 37 * hash + 22;
            hash = 53 * hash + this.getRpcBeginTimeMs();
            if (!this.internalGetExtMap().getMap().isEmpty()) {
                hash = 37 * hash + 23;
                hash = 53 * hash + this.internalGetExtMap().hashCode();
            }
            hash = 37 * hash + 24;
            hash = 53 * hash + this.getSenderAppId();
            hash = 37 * hash + 31;
            hash = 53 * hash + this.getSourceService();
            hash = 37 * hash + 32;
            hash = 53 * hash + this.getTargetService();
            if (!this.internalGetServiceAppIdMap().getMap().isEmpty()) {
                hash = 37 * hash + 33;
                hash = 53 * hash + this.internalGetServiceAppIdMap().hashCode();
            }
            hash = 37 * hash + 34;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSetGameThread());
            hash = 37 * hash + 35;
            hash = 53 * hash + this.getGameThreadIndex();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PacketHead parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PacketHead.PARSER.parseFrom(data);
        }
        
        public static PacketHead parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PacketHead.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PacketHead parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PacketHead.PARSER.parseFrom(data);
        }
        
        public static PacketHead parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PacketHead.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PacketHead parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PacketHead.PARSER.parseFrom(data);
        }
        
        public static PacketHead parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PacketHead.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PacketHead parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PacketHead.PARSER, input);
        }
        
        public static PacketHead parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PacketHead.PARSER, input, extensionRegistry);
        }
        
        public static PacketHead parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PacketHead.PARSER, input);
        }
        
        public static PacketHead parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PacketHead.PARSER, input, extensionRegistry);
        }
        
        public static PacketHead parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PacketHead.PARSER, input);
        }
        
        public static PacketHead parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PacketHead.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PacketHead.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PacketHead prototype) {
            return PacketHead.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PacketHead.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PacketHead getDefaultInstance() {
            return PacketHead.DEFAULT_INSTANCE;
        }
        
        public static Parser<PacketHead> parser() {
            return PacketHead.PARSER;
        }
        
        @Override
        public Parser<PacketHead> getParserForType() {
            return PacketHead.PARSER;
        }
        
        @Override
        public PacketHead getDefaultInstanceForType() {
            return PacketHead.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PacketHead();
            PARSER = new AbstractParser<PacketHead>() {
                @Override
                public PacketHead parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PacketHead(input, extensionRegistry);
                }
            };
        }
        
        private static final class ExtMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(PacketHeadOuterClass.internal_static_PacketHead_ExtMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        private static final class ServiceAppIdMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(PacketHeadOuterClass.internal_static_PacketHead_ServiceAppIdMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PacketHeadOrBuilder
        {
            private int bitField0_;
            private int packetId_;
            private int rpcId_;
            private int clientSequenceId_;
            private int enetChannelId_;
            private int enetIsReliable_;
            private long sentMs_;
            private int userId_;
            private int userIp_;
            private int userSessionId_;
            private long recvTimeMs_;
            private int rpcBeginTimeMs_;
            private MapField<Integer, Integer> extMap_;
            private int senderAppId_;
            private int sourceService_;
            private int targetService_;
            private MapField<Integer, Integer> serviceAppIdMap_;
            private boolean isSetGameThread_;
            private int gameThreadIndex_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PacketHeadOuterClass.internal_static_PacketHead_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 23: {
                        return this.internalGetExtMap();
                    }
                    case 33: {
                        return this.internalGetServiceAppIdMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 23: {
                        return this.internalGetMutableExtMap();
                    }
                    case 33: {
                        return this.internalGetMutableServiceAppIdMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PacketHeadOuterClass.internal_static_PacketHead_fieldAccessorTable.ensureFieldAccessorsInitialized(PacketHead.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PacketHead.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.packetId_ = 0;
                this.rpcId_ = 0;
                this.clientSequenceId_ = 0;
                this.enetChannelId_ = 0;
                this.enetIsReliable_ = 0;
                this.sentMs_ = 0L;
                this.userId_ = 0;
                this.userIp_ = 0;
                this.userSessionId_ = 0;
                this.recvTimeMs_ = 0L;
                this.rpcBeginTimeMs_ = 0;
                this.internalGetMutableExtMap().clear();
                this.senderAppId_ = 0;
                this.sourceService_ = 0;
                this.targetService_ = 0;
                this.internalGetMutableServiceAppIdMap().clear();
                this.isSetGameThread_ = false;
                this.gameThreadIndex_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PacketHeadOuterClass.internal_static_PacketHead_descriptor;
            }
            
            @Override
            public PacketHead getDefaultInstanceForType() {
                return PacketHead.getDefaultInstance();
            }
            
            @Override
            public PacketHead build() {
                final PacketHead result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PacketHead buildPartial() {
                final PacketHead result = new PacketHead(this);
                final int from_bitField0_ = this.bitField0_;
                result.packetId_ = this.packetId_;
                result.rpcId_ = this.rpcId_;
                result.clientSequenceId_ = this.clientSequenceId_;
                result.enetChannelId_ = this.enetChannelId_;
                result.enetIsReliable_ = this.enetIsReliable_;
                result.sentMs_ = this.sentMs_;
                result.userId_ = this.userId_;
                result.userIp_ = this.userIp_;
                result.userSessionId_ = this.userSessionId_;
                result.recvTimeMs_ = this.recvTimeMs_;
                result.rpcBeginTimeMs_ = this.rpcBeginTimeMs_;
                (result.extMap_ = this.internalGetExtMap()).makeImmutable();
                result.senderAppId_ = this.senderAppId_;
                result.sourceService_ = this.sourceService_;
                result.targetService_ = this.targetService_;
                (result.serviceAppIdMap_ = this.internalGetServiceAppIdMap()).makeImmutable();
                result.isSetGameThread_ = this.isSetGameThread_;
                result.gameThreadIndex_ = this.gameThreadIndex_;
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
                if (other instanceof PacketHead) {
                    return this.mergeFrom((PacketHead)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PacketHead other) {
                if (other == PacketHead.getDefaultInstance()) {
                    return this;
                }
                if (other.getPacketId() != 0) {
                    this.setPacketId(other.getPacketId());
                }
                if (other.getRpcId() != 0) {
                    this.setRpcId(other.getRpcId());
                }
                if (other.getClientSequenceId() != 0) {
                    this.setClientSequenceId(other.getClientSequenceId());
                }
                if (other.getEnetChannelId() != 0) {
                    this.setEnetChannelId(other.getEnetChannelId());
                }
                if (other.getEnetIsReliable() != 0) {
                    this.setEnetIsReliable(other.getEnetIsReliable());
                }
                if (other.getSentMs() != 0L) {
                    this.setSentMs(other.getSentMs());
                }
                if (other.getUserId() != 0) {
                    this.setUserId(other.getUserId());
                }
                if (other.getUserIp() != 0) {
                    this.setUserIp(other.getUserIp());
                }
                if (other.getUserSessionId() != 0) {
                    this.setUserSessionId(other.getUserSessionId());
                }
                if (other.getRecvTimeMs() != 0L) {
                    this.setRecvTimeMs(other.getRecvTimeMs());
                }
                if (other.getRpcBeginTimeMs() != 0) {
                    this.setRpcBeginTimeMs(other.getRpcBeginTimeMs());
                }
                this.internalGetMutableExtMap().mergeFrom(other.internalGetExtMap());
                if (other.getSenderAppId() != 0) {
                    this.setSenderAppId(other.getSenderAppId());
                }
                if (other.getSourceService() != 0) {
                    this.setSourceService(other.getSourceService());
                }
                if (other.getTargetService() != 0) {
                    this.setTargetService(other.getTargetService());
                }
                this.internalGetMutableServiceAppIdMap().mergeFrom(other.internalGetServiceAppIdMap());
                if (other.getIsSetGameThread()) {
                    this.setIsSetGameThread(other.getIsSetGameThread());
                }
                if (other.getGameThreadIndex() != 0) {
                    this.setGameThreadIndex(other.getGameThreadIndex());
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
                PacketHead parsedMessage = null;
                try {
                    parsedMessage = PacketHead.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PacketHead)e.getUnfinishedMessage();
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
            public int getPacketId() {
                return this.packetId_;
            }
            
            public Builder setPacketId(final int value) {
                this.packetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPacketId() {
                this.packetId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRpcId() {
                return this.rpcId_;
            }
            
            public Builder setRpcId(final int value) {
                this.rpcId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRpcId() {
                this.rpcId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getClientSequenceId() {
                return this.clientSequenceId_;
            }
            
            public Builder setClientSequenceId(final int value) {
                this.clientSequenceId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientSequenceId() {
                this.clientSequenceId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEnetChannelId() {
                return this.enetChannelId_;
            }
            
            public Builder setEnetChannelId(final int value) {
                this.enetChannelId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEnetChannelId() {
                this.enetChannelId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEnetIsReliable() {
                return this.enetIsReliable_;
            }
            
            public Builder setEnetIsReliable(final int value) {
                this.enetIsReliable_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEnetIsReliable() {
                this.enetIsReliable_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getSentMs() {
                return this.sentMs_;
            }
            
            public Builder setSentMs(final long value) {
                this.sentMs_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSentMs() {
                this.sentMs_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUserId() {
                return this.userId_;
            }
            
            public Builder setUserId(final int value) {
                this.userId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUserId() {
                this.userId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUserIp() {
                return this.userIp_;
            }
            
            public Builder setUserIp(final int value) {
                this.userIp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUserIp() {
                this.userIp_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUserSessionId() {
                return this.userSessionId_;
            }
            
            public Builder setUserSessionId(final int value) {
                this.userSessionId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUserSessionId() {
                this.userSessionId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getRecvTimeMs() {
                return this.recvTimeMs_;
            }
            
            public Builder setRecvTimeMs(final long value) {
                this.recvTimeMs_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRecvTimeMs() {
                this.recvTimeMs_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRpcBeginTimeMs() {
                return this.rpcBeginTimeMs_;
            }
            
            public Builder setRpcBeginTimeMs(final int value) {
                this.rpcBeginTimeMs_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRpcBeginTimeMs() {
                this.rpcBeginTimeMs_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetExtMap() {
                if (this.extMap_ == null) {
                    return MapField.emptyMapField(ExtMapDefaultEntryHolder.defaultEntry);
                }
                return this.extMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableExtMap() {
                this.onChanged();
                if (this.extMap_ == null) {
                    this.extMap_ = MapField.newMapField(ExtMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.extMap_.isMutable()) {
                    this.extMap_ = this.extMap_.copy();
                }
                return this.extMap_;
            }
            
            @Override
            public int getExtMapCount() {
                return this.internalGetExtMap().getMap().size();
            }
            
            @Override
            public boolean containsExtMap(final int key) {
                return this.internalGetExtMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getExtMap() {
                return this.getExtMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getExtMapMap() {
                return this.internalGetExtMap().getMap();
            }
            
            @Override
            public int getExtMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetExtMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getExtMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetExtMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearExtMap() {
                this.internalGetMutableExtMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeExtMap(final int key) {
                this.internalGetMutableExtMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableExtMap() {
                return this.internalGetMutableExtMap().getMutableMap();
            }
            
            public Builder putExtMap(final int key, final int value) {
                this.internalGetMutableExtMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllExtMap(final Map<Integer, Integer> values) {
                this.internalGetMutableExtMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getSenderAppId() {
                return this.senderAppId_;
            }
            
            public Builder setSenderAppId(final int value) {
                this.senderAppId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSenderAppId() {
                this.senderAppId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSourceService() {
                return this.sourceService_;
            }
            
            public Builder setSourceService(final int value) {
                this.sourceService_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSourceService() {
                this.sourceService_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTargetService() {
                return this.targetService_;
            }
            
            public Builder setTargetService(final int value) {
                this.targetService_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetService() {
                this.targetService_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, Integer> internalGetServiceAppIdMap() {
                if (this.serviceAppIdMap_ == null) {
                    return MapField.emptyMapField(ServiceAppIdMapDefaultEntryHolder.defaultEntry);
                }
                return this.serviceAppIdMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableServiceAppIdMap() {
                this.onChanged();
                if (this.serviceAppIdMap_ == null) {
                    this.serviceAppIdMap_ = MapField.newMapField(ServiceAppIdMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.serviceAppIdMap_.isMutable()) {
                    this.serviceAppIdMap_ = this.serviceAppIdMap_.copy();
                }
                return this.serviceAppIdMap_;
            }
            
            @Override
            public int getServiceAppIdMapCount() {
                return this.internalGetServiceAppIdMap().getMap().size();
            }
            
            @Override
            public boolean containsServiceAppIdMap(final int key) {
                return this.internalGetServiceAppIdMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getServiceAppIdMap() {
                return this.getServiceAppIdMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getServiceAppIdMapMap() {
                return this.internalGetServiceAppIdMap().getMap();
            }
            
            @Override
            public int getServiceAppIdMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetServiceAppIdMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getServiceAppIdMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetServiceAppIdMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearServiceAppIdMap() {
                this.internalGetMutableServiceAppIdMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeServiceAppIdMap(final int key) {
                this.internalGetMutableServiceAppIdMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableServiceAppIdMap() {
                return this.internalGetMutableServiceAppIdMap().getMutableMap();
            }
            
            public Builder putServiceAppIdMap(final int key, final int value) {
                this.internalGetMutableServiceAppIdMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllServiceAppIdMap(final Map<Integer, Integer> values) {
                this.internalGetMutableServiceAppIdMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public boolean getIsSetGameThread() {
                return this.isSetGameThread_;
            }
            
            public Builder setIsSetGameThread(final boolean value) {
                this.isSetGameThread_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSetGameThread() {
                this.isSetGameThread_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGameThreadIndex() {
                return this.gameThreadIndex_;
            }
            
            public Builder setGameThreadIndex(final int value) {
                this.gameThreadIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGameThreadIndex() {
                this.gameThreadIndex_ = 0;
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
    
    public interface PacketHeadOrBuilder extends MessageOrBuilder
    {
        int getPacketId();
        
        int getRpcId();
        
        int getClientSequenceId();
        
        int getEnetChannelId();
        
        int getEnetIsReliable();
        
        long getSentMs();
        
        int getUserId();
        
        int getUserIp();
        
        int getUserSessionId();
        
        long getRecvTimeMs();
        
        int getRpcBeginTimeMs();
        
        int getExtMapCount();
        
        boolean containsExtMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getExtMap();
        
        Map<Integer, Integer> getExtMapMap();
        
        int getExtMapOrDefault(final int p0, final int p1);
        
        int getExtMapOrThrow(final int p0);
        
        int getSenderAppId();
        
        int getSourceService();
        
        int getTargetService();
        
        int getServiceAppIdMapCount();
        
        boolean containsServiceAppIdMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getServiceAppIdMap();
        
        Map<Integer, Integer> getServiceAppIdMapMap();
        
        int getServiceAppIdMapOrDefault(final int p0, final int p1);
        
        int getServiceAppIdMapOrThrow(final int p0);
        
        boolean getIsSetGameThread();
        
        int getGameThreadIndex();
    }
}
